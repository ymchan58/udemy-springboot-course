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

            // print out address: street and city
            Address theStudentAddress = theStudent.getAddress();

            System.out.println("Street = " + theStudentAddress.getStreet());
            System.out.println("City = " + theStudentAddress.getCity());

            // print out languages
            for (String theStudentLanguages : theStudent.getLanguages()) {
                System.out.println(theStudentLanguages);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
