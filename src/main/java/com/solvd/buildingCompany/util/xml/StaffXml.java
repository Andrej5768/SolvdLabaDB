package com.solvd.buildingCompany.util.xml;

import com.solvd.buildingCompany.persistence.model.Staff;
import jakarta.xml.bind.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;




public class StaffXml {

    private static final Logger LOGGER = LoggerFactory.getLogger(StaffXml.class);

    public static void marshal(Staff staff, String filePath) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Staff.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(staff, new FileWriter(filePath));
        LOGGER.info("Marshalled object");
    }

    public static void marshalList(List<Staff> staffList, String filePath) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(StaffHolder.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(new StaffHolder(staffList), new File(filePath));
        LOGGER.info("Marshalled object");
    }

    public static Staff unmarshal(String filePath) throws IOException, JAXBException {
        Staff staff;
        JAXBContext context = JAXBContext.newInstance(Staff.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        staff = (Staff) unmarshaller.unmarshal(new File(filePath));
        LOGGER.info("Unmarshalled and assigned staff value");
        return staff;
    }

    public static List<Staff> unmarshalList(String filePath) throws IOException, JAXBException {
        StaffHolder staffHolder;
        JAXBContext context = JAXBContext.newInstance(StaffHolder.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        staffHolder = (StaffHolder) unmarshaller.unmarshal(new File(filePath));
        LOGGER.info("Unmarshalled and assigned staff value");
        return staffHolder.getStaffList();
    }
}