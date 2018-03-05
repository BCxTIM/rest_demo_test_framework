package com.timrusso.rest.hooks;

import cucumber.api.java.Before;
import org.springframework.beans.factory.annotation.Autowired;
import com.timrusso.rest.utils.DatabaseScripUtils;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by tmoiseev on 3/4/2018.
 */
public class DBHooks {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private String cleanup;


    @Before
    public final void cleanDb() throws SQLException {
        DatabaseScripUtils.executeScript(dataSource, cleanup);
    }
}
