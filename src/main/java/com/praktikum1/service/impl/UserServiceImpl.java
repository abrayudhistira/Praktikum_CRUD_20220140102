package com.praktikum1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.praktikum1.model.dto.UserAddRequest;
import com.praktikum1.model.dto.UserDto;
import com.praktikum1.model.entity.User;
import com.praktikum1.repository.UserRepository;
import com.praktikum1.service.UserService;
import com.praktikum1.util.ValidationUtil;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ValidationUtil validationUtil;

    @Override
    public UserDto AddUser(UserAddRequest request) {
        validationUtil.validate(request);

        User saveUser = User.builder()
                .id(UUID.randomUUID().toString())
                .name(request.getName())
                .age(request.getAge())
                .build();

        userRepository.save(saveUser);

        UserDto userDto = UserMapper.MAPPER.toUserDtoData(saveUser);

        User saveUser = User.builder()
                .id(UUID.randomUUID().toString())
                .name(request.getName())
                .age(request.getAge())
                .build();

        userRepository.save(saveUser);

        UserDto userDto = UserMapper.MAPPER.toUserDtoData(saveUser);

        return userDto
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> users = userRepository.findAll();
        List<UserDto> userDto = new ArrayList<>();
        for (User user : users) {
            userDto.add(UserMapper.MAPPER.toUserDtoData(user));
        }
        return userDto;
    }

    @Override
    public UserDto getUserById(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public UserDto updateUser(String id, UserAddRequest request) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void DeleteUser(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
