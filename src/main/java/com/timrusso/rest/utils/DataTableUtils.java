package com.timrusso.rest.utils;

import cucumber.api.DataTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tmoiseev on 3/4/2018.
 */
public class DataTableUtils {

    public static Map<String, String> asMap(DataTable dataTable) {
        Map<String, String> result = new HashMap<String, String>();
        List<String> headers = dataTable.topCells();
        List<String> data = dataTable.raw().get(1);
        for(int i = 0; i < headers.size(); i ++) {
            result.put(headers.get(i), data.get(i));
        }
        return result;
    }
}
