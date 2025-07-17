package com.vasu.electronic.store.services;

import com.vasu.electronic.store.dtos.UserDto;
import com.vasu.electronic.store.entities.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto userDto,String userId);
    void deleteUser(String userId);
    List<UserDto>getAllUser();
    UserDto getUserById(String userId);
    UserDto getUserByEmail(String email);
    List<UserDto> searchUser(String keyword);
}
