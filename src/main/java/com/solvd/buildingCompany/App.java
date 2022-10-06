package com.solvd.buildingCompany;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import jakarta.xml.bind.JAXBException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.solvd.buildingCompany.connection.DataSource;
import com.solvd.buildingCompany.persistence.model.Project;
import com.solvd.buildingCompany.persistence.model.Staff;
import com.solvd.buildingCompany.service.ProjectService;
import com.solvd.buildingCompany.service.StaffService;
import com.solvd.buildingCompany.util.json.StaffJson;
import com.solvd.buildingCompany.util.xml.StaffXml;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws JAXBException {
        File xmlOutPath = new File("src/main/resources/xml/output.xml");
        File xmlInPath = new File("src/main/resources/xml/input.xml");
        File jsonInPath = new File("src/main/resources/json/input.json");
        File jsonOutPath = new File("src/main/resources/json/output.json");

        //Connection Pool
        try (Connection connection = DataSource.getConnection(); Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM building_company.staff");
            while (resultSet.next()) {
                Staff staff = new Staff(resultSet.getLong(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDate(4),
                        resultSet.getLong(6),
                        resultSet.getLong(7),
                        resultSet.getLong(8),
                        resultSet.getLong(9),
                        resultSet.getLong(10)
                );
                LOGGER.info(staff.toString());
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Project service example MyBatis
        List<Project> projectList = new ProjectService().getAllProject();

        //Staff service example MyBatis
        Staff petro = new Staff("Petro", "Petrenko", new java.sql.Date(2022, 10, 24), 3L, 1L, 2L, 2L, 3L);
        new StaffService().save(petro);
        List<Staff> staffList0 = new StaffService().getAllStaff();
        for (Staff staff : staffList0) {
            LOGGER.info(staff.toString());
            LOGGER.info(staff.getCreatedProjects().toString());
            LOGGER.info(staff.getAssignedProjects().toString());
        }

        //JAXB write file
        List<Staff> staffList = new StaffService().getAllStaff();
        try {
            StaffXml.marshalList(staffList, String.valueOf(xmlInPath));
        } catch (IOException | JAXBException e) {
            throw new RuntimeException(e);
        }

        //JAXB read file
        try {
            List<Staff> staffList2 = StaffXml.unmarshalList(String.valueOf(xmlInPath));
            for (Staff staff : staffList2) {
                LOGGER.info(staff.toString());
            }
        } catch (IOException | JAXBException e) {
            throw new RuntimeException(e);
        }

        //Jackson write file
        List<Staff> staffList3 = new StaffService().getAllStaff();
        StaffJson.marshal(staffList3, jsonInPath.toString());

        //Jackson read file
        List<Staff> staffList2 = StaffJson.unmarshalList(jsonInPath.toString());
        for (Staff staff : staffList2) {
            System.out.println(staff);
        }

    }
}

