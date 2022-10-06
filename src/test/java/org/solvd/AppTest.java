package org.solvd;

import static org.junit.Assert.assertTrue;

import com.solvd.buildingCompany.connection.DataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testConnection() {
        try {
            Connection connection = DataSource.getConnection();
            if (!connection.isClosed())
                System.out.println("Connection not ready");
            else {
                DataSource.returnConnection(connection);
                System.out.println("Connection enable");
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
