package com.vasu.electronic.store.security;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(properties = {
        "jwt.secret=testSecretKeyForJWTTokenGeneration2024!@#$%^&*()"
})
public class JwtHelperTest {

    @Autowired
    private JwtHelper jwtHelper;

    private UserDetails userDetails;

    @BeforeEach
    void setUp() {
        // Create a mock user details for testing
        userDetails = org.springframework.security.core.userdetails.User.builder()
                .username("test@example.com")
                .password("password")
                .roles("USER")
                .build();
    }

    @Test
    void testGenerateToken() {
        // Test JWT generation
        String token = jwtHelper.generateToken(userDetails);

        // Verify token is not null or empty
        assertNotNull(token);
        assertFalse(token.isEmpty());

        // Verify token has the correct format (3 parts separated by 2 dots)
        String[] parts = token.split("\\.");
        assertEquals(3, parts.length, "JWT should have 3 parts separated by dots");

        System.out.println("Generated JWT: " + token);
    }

    @Test
    void testGetUsernameFromToken() {
        // Generate a token first
        String token = jwtHelper.generateToken(userDetails);

        // Extract username from token
        String username = jwtHelper.getUsernameFromToken(token);

        // Verify username matches
        assertEquals("test@example.com", username);
    }

    @Test
    void testValidateToken() {
        // Generate a token first
        String token = jwtHelper.generateToken(userDetails);

        // Validate the token
        Boolean isValid = jwtHelper.validateToken(token, userDetails);

        // Verify token is valid
        assertTrue(isValid);
    }

    @Test
    void testInvalidToken() {
        // Test with an invalid token (like the mock token from the error)
        String invalidToken = "mock-jwt-token-admin";

        // This should throw an exception or return false
        assertThrows(Exception.class, () -> {
            jwtHelper.getUsernameFromToken(invalidToken);
        });
    }
}