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
        boolean result = userValidation.validateFirstName("m");
        System.out.println(result);
        Assertions.assertEquals(false,false);
    }
    @Test
    public void givenFirstName_WhereShort_ShouldReturnFalse2(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("m");
        System.out.println(result);
        Assertions.assertEquals(true,result);
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
        @Test
    public void givenEmail_whereProper_shouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateEmail("abc.xyz@bl.co.in");
        System.out.println(result);
        Assertions.assertEquals(true,result);

        }
    @Test
    public void givenEmail_whereNotProper_shouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateEmail("abc.");
        System.out.println(result);
        Assertions.assertEquals(false, false);
    }
    @Test
    public void givenMobile_WhereProper_shouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePhoneNumber("918709628464");
        System.out.println(result);
        Assertions.assertEquals(true,result);
    }
    @Test
    public void givenPassword_whereProper_shouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePassWord("Murariku@123");
        System.out.println(result);
        Assertions.assertEquals(true,result);
    }
    @Test
    public void givenPassword_whereNotProper_shouldReturnFalse(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePassWord2("Mura@1");
        System.out.println(result);
        Assertions.assertEquals(false,result);
    }
    @Test
    public void givenPassword_wherePerfect_shouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePassWord3("Murariku@123");
        System.out.println(result);
        Assertions.assertEquals(true,result);
    }


























}
