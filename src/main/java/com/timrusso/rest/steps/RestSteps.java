package com.timrusso.rest.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import com.timrusso.rest.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.timrusso.rest.service.BookService;
import com.timrusso.rest.service.BookServiceImpl;
import com.timrusso.rest.utils.DataTableUtils;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;


/**
 * Created by tmoiseev on 3/4/2018.
 */
@Component
public class RestSteps extends AbstractSteps {

    @Autowired
    BookService bookService;

    @Autowired
    Book book;


    public static Logger logger = Logger.getLogger(RestSteps.class.getName());


    public RestSteps() {
        this.bookService = new BookServiceImpl();
    }


    @Given("^get all books$")
    public void getAllBooks() {
        bookService.getAllBooks();
    }

    @When("^count of books is (\\d+)$")
    public void countOfBooksIsNumber(int number) {
        List<Book> books = bookService.getAllBooks();
        assertTrue("Corresponding size", books.size() == number);
        logger.info("Corresponding size");

    }

    @When("^add new book$")
    public void addNewBook(DataTable dataTable) {
        Map<String, String> map = DataTableUtils.asMap(dataTable);
        book.setTitle(map.get("title"));
        book.setAuthor(map.get("author"));

        bookService.addBook(book);

    }

    @Given("^get book by id (\\d+)$")
    public void getBookByid(int id) {
       Book book =  bookService.getBook(id);
        System.out.println(book);
    }

    @And("^verify that title is (.*) and author is (.*) for book by id (\\d+)$")
    public void verifyBook(String title, String author, int id) {
        Book book = bookService.getBook(id);
        assertTrue(String.format("Book title is [%s] for book id [%d]", title, id), book.getTitle().equals(title));
        assertTrue(String.format("Book author is [%s] for book id [%d]", title, id), book.getAuthor().equals(author));
    }

    @And("^update book with id (\\d+)$")
    public void updateBookWithId(int id, DataTable dataTable) {
        Map<String, String> map = DataTableUtils.asMap(dataTable);
        book.setTitle(map.get("title"));
        book.setAuthor(map.get("author"));

        bookService.update(id, book);
    }

    @And("^delete book id (\\d+)$")
    public void deleteBookById(int id) {
        bookService.delete(id);
    }
}
