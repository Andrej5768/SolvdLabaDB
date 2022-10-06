package com.solvd.buildingCompany.util.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.solvd.buildingCompany.App;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
import com.solvd.buildingCompany.persistence.model.Staff;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StaffJson {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

//    public static void staffToJson() throws Exception {
//        //Creating a JSONObject object
//        JSONObject jsonObject = new JSONObject();
//        //Creating a json array
//        JSONArray array = new JSONArray();
//        //Getting ResultSet
//        Connection connection = DataSource.getConnection();
//        Statement statement = connection.createStatement();
//        ResultSet rs = statement.executeQuery("SELECT * FROM building_company.staff");
//        //Inserting ResutlSet data into the json object
//        while (rs.next()) {
//            JSONObject record = new JSONObject();
//            //Inserting key-value pairs into the json object
//            record.put("ID", rs.getInt("staff_id"));
//            record.put("First_Name", rs.getString("first_name"));
//            record.put("Last_Name", rs.getString("last_name"));
//            record.put("Start_Date", rs.getDate("start_date").toString());
//            record.put("End_Date", rs.getDate("end_date") == null ? null : rs.getDate("end_date").toString());
//            record.put("Department_id", rs.getInt("dept_id"));
//            record.put("Position_id", rs.getInt("pos_id"));
//            record.put("Address_id", rs.getInt("address_id"));
//            record.put("Phone_Number_id", rs.getInt("phone_number_id"));
//            record.put("Crew_id", rs.getInt("crews_id"));
//            record.put("Salary_id", rs.getInt("salaries_id"));
//            array.add(record);
//        }
//        jsonObject.put("Staff_data", array);
//        try {
//            FileWriter file = new FileWriter("D:/Solvd LABA/Projects/Building_Company/src/main/resources/json/staff.json");
//            file.write(jsonObject.toJSONString());
//            file.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        logger.info("JSON file created......");
//    }


    public static void marshal(Staff staff, String filePath) {
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        try {
            mapper.writeValue(new File(filePath), staff);
            LOGGER.info("Marshalled object");
        } catch (IOException e) {
            LOGGER.error("fail to write json!");
        }
    }
    public static void marshal(List<Staff> staffList, String filePath) {
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        try {
            mapper.writeValue(new File(filePath), staffList);
            LOGGER.info("Marshalled object");
        } catch (IOException e) {
            LOGGER.error("fail to write json!");
        }
    }
    public static Staff unmarshal(String filePath) {
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        Staff staff = null;
        try {
            staff = mapper.readValue(new File(filePath), Staff.class);
            LOGGER.info("Unmarshalled and assigned staff value");
        } catch (IOException e) {
            LOGGER.error("fail to read json!");
        }
        return staff;
    }
    public static List<Staff> unmarshalList(String filePath){
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        List<Staff> staffList = new ArrayList<>();
        try {
            staffList = mapper.readValue(new File(filePath),
                    mapper.getTypeFactory().constructCollectionType(List.class, Staff.class));
            LOGGER.info("Unmarshalled and assigned staff value");
        } catch (IOException e) {
            LOGGER.error("fail to read json!");
        }
        return staffList;
    }
}