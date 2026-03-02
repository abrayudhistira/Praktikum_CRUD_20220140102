package com.praktikum1.service;

import java.util.List;

import com.praktikum1.model.dto.UserAddRequest;
import com.praktikum1.model.dto.UserDto;

public interface UserService {
    UserDto AddUser (UserAddRequest request);
    List<UserDto> getAllUser();
    UserDto getUserById(String id);
    UserDto updateUser(String id, UserAddRequest request);
    void DeleteUser(String id);
}
