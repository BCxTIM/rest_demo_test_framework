package com.timrusso.rest.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by tmoiseev on 3/4/2018.
 */
@Entity(name = "book")
public class BookEntity implements Serializable{

    @Id
    private int id;
    private String title;
    private String author;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
