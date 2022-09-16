package com.solvd.buildingCompany.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {

    static ConnectionPool pool = new ConnectionPool();

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        return pool.getConnectionFromPool();
    }

    public static void returnConnection(Connection connection) {
        pool.returnConnectionToPool(connection);
    }
}