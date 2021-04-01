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
























}
