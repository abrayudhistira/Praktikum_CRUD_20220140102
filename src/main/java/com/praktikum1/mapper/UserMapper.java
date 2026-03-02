package com.praktikum1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.praktikum1.model.dto.UserDto;
import com.praktikum1.model.entity.User;

@Mapper
public interface UserMapper {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
    UserDto toUserDtoData (User user);
}
