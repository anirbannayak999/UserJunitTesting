package com.bridgelabz;

import org.example.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        boolean result = UserRegistration.firstName("Anirban");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        boolean result = UserRegistration.firstName("anirban");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_Whenvalid_ShouldReturnTrue() {
        boolean result = UserRegistration.lastName("Nayak");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        boolean result = UserRegistration.lastName("nayak");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        boolean result = UserRegistration.email("anirban@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        boolean result = UserRegistration.email("nayak");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        boolean result = UserRegistration.mobileNumber("91 9919819801");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        boolean result = UserRegistration.mobileNumber("9919819801");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        boolean result = UserRegistration.password("sdhP567.#56");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse() {
        boolean result = UserRegistration.password("pe.dfg#");
        Assert.assertEquals(false, result);
    }
}

