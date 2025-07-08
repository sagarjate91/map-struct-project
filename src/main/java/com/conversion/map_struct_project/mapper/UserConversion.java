package com.conversion.map_struct_project.mapper;

import org.mapstruct.Mapper;

import com.conversion.map_struct_project.dto.UserDto;
import com.conversion.map_struct_project.model.User;

@Mapper(componentModel = "spring")
public interface UserConversion {

    
    @org.mapstruct.Mapping(target = "id", source = "id")
    @org.mapstruct.Mapping(target = "name", source = "name")
    @org.mapstruct.Mapping(target = "email", source = "email")
    @org.mapstruct.Mapping(target = "password", source = "password")
    @org.mapstruct.Mapping(target = "phoneNumber", source = "phoneNumber")
    @org.mapstruct.Mapping(target = "address", source = "address")
    UserDto toUserDto(User user);

    User toUser(UserDto userDto);

    default String phoneNumber(String phoneNumber) {
        return "+91" + phoneNumber;
    }

}
