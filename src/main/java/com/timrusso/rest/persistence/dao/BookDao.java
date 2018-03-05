package com.timrusso.rest.persistence.dao;

import com.timrusso.rest.persistence.entity.BookEntity;

/**
 * Created by tmoiseev on 3/4/2018.
 */
public interface BookDao {
    BookEntity getBookById(int id);
}
