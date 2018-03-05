package com.timrusso.rest.steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by tmoiseev on 3/5/2018.
 */
@ContextConfiguration(locations = "/cucumber.xml")
public abstract class AbstractSteps {
    protected Logger logger = LoggerFactory.getLogger(AbstractSteps.class);
}
