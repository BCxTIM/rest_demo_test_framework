package com.timrusso.rest.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.timrusso.rest.model.Book;

import java.io.IOException;
import java.util.List;

/**
 * Created by tmoiseev on 3/2/2018.
 */
public class JsonUtils {

    public static String parseObjectToJson(Object object) {
        ObjectMapper mapper = new ObjectMapper();

        try{
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Book> parseJsonToList(String json) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try{
            return mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, Book.class));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Book parseJsonToObject(String json) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try{
            return mapper.readValue(json, Book.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
