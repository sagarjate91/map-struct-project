package com.conversion.map_struct_project.mapper;

import org.mapstruct.Mapper;

import com.conversion.map_struct_project.dto.UserDto;
import com.conversion.map_struct_project.model.User;

@Mapper(componentModel = "spring")
public interface UserConversion {

    UserDto toUserDto(User user);

    User toUser(UserDto userDto);



}
