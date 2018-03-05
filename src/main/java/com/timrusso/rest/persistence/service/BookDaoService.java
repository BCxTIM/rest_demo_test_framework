package com.timrusso.rest.persistence.service;

import com.timrusso.rest.persistence.entity.BookEntity;

/**
 * Created by tmoiseev on 3/4/2018.
 */
public interface BookDaoService {
    BookEntity getBookById(int id);
}
