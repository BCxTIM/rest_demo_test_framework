package com.timrusso.rest.persistence.dao;

import com.timrusso.rest.persistence.service.AbstractGenericDao;
import com.timrusso.rest.persistence.entity.BookEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by tmoiseev on 3/4/2018.
 */
@Repository
public class BookDaoImpl extends AbstractGenericDao implements BookDao {

    public BookEntity getBookById(int id) {
        return getEntityManager().find(BookEntity.class, id);
    }
}
