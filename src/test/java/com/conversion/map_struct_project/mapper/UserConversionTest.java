package com.conversion.map_struct_project.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.conversion.map_struct_project.dto.UserDto;
import com.conversion.map_struct_project.model.User;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserConversionTest {

    @Autowired
    private UserConversion userConversion;

    @Test
    public void testUserToUserDto() {
        // Given
        User user = new User();
        user.setId(1L);
        user.setName("Test User");
        user.setEmail("test@email.com");
        user.setPhoneNumber("1234567890");
        user.setAddress("Test Address");

        // When
        UserDto userDto = userConversion.toUserDto(user);

        // Then
        assertNotNull(userDto);
        assertEquals(1L, userDto.getId());
        assertEquals("Test User", userDto.getName());
        assertEquals("test@email.com", userDto.getEmail());
        assertEquals("+911234567890", userDto.getPhoneNumber()); // Should have +91 prefix
        assertEquals("Test Address", userDto.getAddress());
    }
}
