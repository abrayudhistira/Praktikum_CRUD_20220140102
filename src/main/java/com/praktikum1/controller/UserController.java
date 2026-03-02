package com.praktikum1.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.praktikum1.model.dto.UserAddRequest;
import com.praktikum1.model.dto.UserDto;
import com.praktikum1.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(
        path = "/api/users",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> AddUser(@RequestBody UserAddRequest request) {
        UserDto result = userService.AddUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
            "status", "success",
            "data", result
        ));
    }
    @GetMapping(
        path = "/api/users",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getAllUser() {
        List<UserDto> result = userService.getAllUser();
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
            "status", "success",
            "data", result
        ));
    }
    @GetMapping(
        path = "/api/users/{id}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getUserById(@PathVariable("id") String id) {
        UserDto result = userService.getUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
            "status", "success",
            "data", result
        ));
    }
    @PutMapping(
        path = "/api/users/{id}",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> UpdateUser(
        @PathVariable("id") String id,
        @RequestBody UserAddRequest request
    ) {
        UserDto result = userService.updateUser(id, request);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
            "status", "success",
            "data", result
        ));
    }

    @DeleteMapping(
        path = "/api/users/{id}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> DeleteUser(@PathVariable("id") String id) {
        userService.DeleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
            "status", "success delete user with id " + id
        ));
    }
}
