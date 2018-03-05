package com.timrusso.rest.steps;

import cucumber.api.java.en.Then;
import com.timrusso.rest.persistence.service.BookDaoService;
import com.timrusso.rest.persistence.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.junit.Assert.assertTrue;

/**
 * Created by tmoiseev on 3/4/2018.
 */
@Component
public class DatabaseSteps extends AbstractSteps {

    @Autowired
    BookDaoService bookDaoService;


    @Then("^book with title (.*) and author (.*) is stored in db by id (\\d+)$")
    public void bookStoredById(String title, String author, int id) {
        BookEntity book = bookDaoService.getBookById(id);
        assertTrue("Book title", book.getTitle().equals(title));
        assertTrue("Book author", book.getAuthor().equals(author));
    }
}
