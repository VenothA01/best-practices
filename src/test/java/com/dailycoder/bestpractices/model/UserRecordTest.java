package com.dailycoder.bestpractices.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRecordTest {


    @Test
    @DisplayName("test for checking Record implementnation")
    public void testUserRecord1(){
        UserRecord userRecord = new UserRecord("user001","user001@example.com",1);
        Assertions.assertEquals("user001",userRecord.userName());
        Assertions.assertEquals("user001@example.com",userRecord.email());
        Assertions.assertEquals(1,userRecord.userId());
    }
}