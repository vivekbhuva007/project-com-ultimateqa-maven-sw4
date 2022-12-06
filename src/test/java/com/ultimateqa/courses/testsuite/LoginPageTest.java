package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {


    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyTheErrorMessage(){
        loginPage.navigatedToLoginPage();

        // email
        loginPage.username("vivendra1045@gmail.com");

        // passcode
        loginPage.passwordField("Vivek123");

        //Click on login button
        loginPage.signButton();


        //verify Invalid email or password occur
        String expectedMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.messageOccur(),expectedMessage,"Message not displayed");


        // Verify Welcome Text Button
        String expectedMessage1 = "Welcome Back!";
        Assert.assertEquals(loginPage.Message(),expectedMessage1,"Message not displayed");
    }




    }
