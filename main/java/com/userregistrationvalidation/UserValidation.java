package com.userregistrationvalidation;

import java.util.regex.Pattern;

public class UserValidation {
    public static boolean validateFirstName(String firstName)
    {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);

    }
    //UC-2: validating last name
    public static boolean validateLastName(String lastName)
    {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName);
    }
    //UC-3: validating email
    public static boolean validateEmail(String email)
    {
        return Pattern.matches("[-a-zA-Z0-9+]+.[-a-zA-Z0-9]*@[a-zA-Z0-9]+(.[a-zA-Z0-9]+)*.[a-zA-Z]{2,}$", email);
    }
    //UC-4: validating predefined mobile number
    public static boolean validatePhoneNumber(String phoneNumber)
    {
        return Pattern.matches("^[91]{2}[0-9]{10}",phoneNumber);
    }
    //UC-5: validating password
    public static boolean validatePassWord(String passWord)
    {
        //    * Rule1: minimum 8 characters
        return Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}", passWord);

    }
    //UC-6: VAlidating Password
    public static boolean validatePassWord2(String passWord)
    {
        //    * Rule1: minimum 8 characters
        return Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}", passWord);

    }
    public static boolean validatePassWord3(String passWord)
    {
        /*
         * Rule1: minimum 8 characters
         * Rule2: at least 1 upper-case
         * Rule3: at least 1 numeric
         */
        return Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}", passWord);

    }






}
