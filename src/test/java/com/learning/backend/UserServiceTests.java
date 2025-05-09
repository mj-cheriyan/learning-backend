package com.learning.backend;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.learning.backend.entity.User;
import com.learning.backend.service.UserService;

@SpringBootTest
class UserServiceTests {

    @Autowired
    private UserService userService;

    @Test
    void testUserCreation() {
        User user = new User(null, "demo@example.com", "plainpass", "USER");
        User saved = userService.register(user);
        assertNotNull(saved.getId());
    }
}