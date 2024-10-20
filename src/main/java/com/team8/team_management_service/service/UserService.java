package com.team8.team_management_service.service;

import com.team8.team_management_service.dto.UserDto;

import java.util.List;
import java.util.Map;

public interface UserService{

    UserDto create(UserDto userDto);

    UserDto update(UserDto user, Long id);

    void delete(Long id);

    UserDto findById(Long id);

    List<UserDto> findAll();

    List<UserDto> findByUsername(String username);

    UserDto partialUpdate(Long id, Map<String, Object> fields);
}
