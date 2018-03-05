package com.timrusso.rest.persistence.service;

import com.timrusso.rest.persistence.dao.BookDao;
import com.timrusso.rest.persistence.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tmoiseev on 3/4/2018.
 */
@Service
public class BookDaoServiceImpl implements BookDaoService{

    private BookDao bookDao;

    @Autowired
    public BookDaoServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }



    public BookEntity getBookById(int id) {
        return bookDao.getBookById(id);
    }
}
