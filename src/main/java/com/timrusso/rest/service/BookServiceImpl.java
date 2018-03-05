package com.timrusso.rest.service;

import com.timrusso.rest.model.Book;
import org.springframework.stereotype.Service;
import com.timrusso.rest.utils.JsonUtils;
import com.timrusso.rest.utils.RequestMethod;
import com.timrusso.rest.utils.RestUtils;

import java.util.List;

/**
 * Created by tmoiseev on 3/2/2018.
 */
@Service
public class BookServiceImpl implements BookService {

    private static String REQUEST_URL = "http://localhost:8080";

    public List<Book> getAllBooks() {
        String json = RestUtils.sendGetDeleteRequest(REQUEST_URL + "/book", RequestMethod.GET);
        return JsonUtils.parseJsonToList(json);
    }

    public void addBook(Book book) {
        RestUtils.sendPostPutRequest(REQUEST_URL + "/book", RequestMethod.POST, JsonUtils.parseObjectToJson(book));
    }

    public void update(int id, Book book) {
        RestUtils.sendPostPutRequest(REQUEST_URL + "/book/" +id, RequestMethod.PUT, JsonUtils.parseObjectToJson(book));
    }

    public Book getBook(int id) {
       String json = RestUtils.sendGetDeleteRequest(REQUEST_URL + "/book/" + id, RequestMethod.GET);
       return JsonUtils.parseJsonToObject(json);
    }

    public void delete(int id) {
        RestUtils.sendGetDeleteRequest(REQUEST_URL + "/book/" + id, RequestMethod.DELETE);
    }
}
