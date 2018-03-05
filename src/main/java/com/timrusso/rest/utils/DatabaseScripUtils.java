package com.timrusso.rest.utils;


import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by tmoiseev on 3/5/2018.
 */
public class DatabaseScripUtils {


    public static void executeScript(DataSource dataSource, String scriptPath) throws SQLException {
        Connection connection = DataSourceUtils.getConnection(dataSource);
        try {
            ClassPathResource resource = new ClassPathResource(scriptPath);
            ScriptUtils.executeSqlScript(connection, resource);
        } catch (Exception e) {
            throw  new CannotGetJdbcConnectionException(e.getMessage());
        } finally {
            connection.close();
        }
    }
}
