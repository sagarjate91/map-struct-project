package com.conversion.map_struct_project.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import com.conversion.map_struct_project.dto.UserDto;
import com.conversion.map_struct_project.model.User;

@Mapper(componentModel = "spring")
@Component
public interface UserConversion {
    @Mapping(target = "phoneNumber", source = "phoneNumber", qualifiedByName = "formatPhoneNumber")
    UserDto toUserDto(User user);

    User toUser(UserDto userDto);
    
    @Named("formatPhoneNumber")
    default String formatPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && !phoneNumber.startsWith("+91")) {
            return "+91" + phoneNumber;
        }
        return phoneNumber;
    }

}
