package com.solvd.buildingCompany;

import com.solvd.buildingCompany.connection.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        try (Connection connection = DataSource.getConnection(); Statement statement = connection.createStatement()) {
            System.out.println(connection.isClosed());
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

