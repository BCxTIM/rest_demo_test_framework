package com.timrusso.rest.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by tmoiseev on 3/2/2018.
 */
public class RestUtils {

    public static String sendPostPutRequest(String requestUrl, RequestMethod requestMethod, String payload) {
        StringBuffer jsonString = new StringBuffer();

        try {
            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod(requestMethod.toString());
            connection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(payload);
            writer.close();


            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;

            while ((line = br.readLine()) != null) {
                jsonString.append(line);
            }

            br.close();
            connection.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonString.toString();
    }

    public static String sendGetDeleteRequest(String requestUrl, RequestMethod requestMethod) {
        StringBuffer jsonString = new StringBuffer();

        try {
            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod(requestMethod.toString());
            connection.setRequestProperty("Content-Type", "application/json");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;

            while ((line = br.readLine()) != null) {
                jsonString.append(line);
            }

            br.close();
            connection.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonString.toString();
    }
}
