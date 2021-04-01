package com.uservalidationtest;

import com.userregistrationvalidation.UserValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_WhereProper_ShouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("Murari");
        System.out.println(result);
        Assertions.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhereShort_ShouldReturnFalse(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("mu");
        System.out.println(result);
        Assertions.assertEquals(false,false);
    }
    @Test
    public void givenLastName_WhereProper_ShouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result =userValidation.validateLastName("Kumar");
        System.out.println(result);
        Assertions.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhereShort_ShouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result =userValidation.validateLastName("Ku");
        System.out.println(result);
        Assertions.assertEquals(false,result);
    }
    @Test
    public void givenLastName_WhereEmpty_ShouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result =userValidation.validateLastName("");
        System.out.println(result);
        Assertions.assertEquals(false,result);
    }

























}
