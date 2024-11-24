package com.mm.journalApp.service;

import com.mm.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Disabled
    @Test
    public void testFindByUserName(){
        assertNotNull(userRepository.findByUserName("Rudra"));
    }

    @ParameterizedTest
    @CsvSource({
            "Moksh",
            "Rudra",
            "Gaurav",
            "Kumar"
    })
    public void test(String username){
        //assertEquals(a+b,expected);
        assertNotNull(userRepository.findByUserName(username),"failed for "+username);
    }


}
