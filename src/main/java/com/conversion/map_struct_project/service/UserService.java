package com.conversion.map_struct_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conversion.map_struct_project.dto.UserDto;
import com.conversion.map_struct_project.mapper.UserConversion;
import com.conversion.map_struct_project.model.User;
import com.conversion.map_struct_project.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConversion userConversion;

    public UserDto createUser(UserDto userDto) {

        // Convert UserDto to User entity
        // and save it to the database
        User user = userConversion.toUser(userDto);

        User userNew = userRepository.save(user);

        // Convert the saved User entity back to UserDto
        // and return it
        UserDto userDtoNew = userConversion.toUserDto(userNew);

        return userDtoNew;

        //return userConversion.toUserDto(userRepository.save(userConversion.toUser(userDto)));
    }

    public UserDto getUserById(Long id) {

        User user = userRepository.findById(id).orElse(null);

        UserDto userDto = userConversion.toUserDto(user);

        return userDto;
    }

}
