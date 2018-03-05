package com.timrusso.rest.persistence.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by tmoiseev on 3/5/2018.
 */
public abstract class AbstractGenericDao {
    @PersistenceContext
    private EntityManager entityManager;


    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
