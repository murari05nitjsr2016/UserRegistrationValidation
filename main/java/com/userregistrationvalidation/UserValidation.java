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



}
