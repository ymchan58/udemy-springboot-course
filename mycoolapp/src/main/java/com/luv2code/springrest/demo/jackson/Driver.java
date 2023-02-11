package com.luv2code.springrest.demo.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {

        try {
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map/convert to Java POJO:
            // data/sample-lite.json
            Student theStudent = mapper.readValue(new File("mycoolapp/data/sample-full.json"), Student.class);

            //print first name and last name
            System.out.println("First name = " + theStudent.getFirstName());
            System.out.println("Last name = " + theStudent.getLastName());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
