package com.mycompany.progpoepart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testSetUsername() {
        String uName = "kyl_1";
        Login instance = new Login();
        instance.setUsername(uName);
        assertEquals(uName, instance.getUserName());
    }

    @Test
    public void testSetPassword() {
        String pWord = "Ch3ck#p@ss";
        Login instance = new Login();
        instance.setPassword(pWord);
        assertEquals(pWord, instance.getUserPassword());
    }

    @Test
    public void testSetCellPhoneNumber() {
        String phone = "+27821234567";
        Login instance = new Login();
        instance.setCellPhoneNumber(phone);
        assertEquals(phone, instance.getCellPhoneNumber());
    }
}