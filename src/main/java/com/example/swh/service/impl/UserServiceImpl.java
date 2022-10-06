package com.example.swh.service.impl;

import com.example.swh.entity.User;
import com.example.swh.mapper.UserMapper;
import com.example.swh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
@Autowired
    private UserMapper usermapper;
@Override
    public int insert(String username,String password){
    return usermapper.insert(username, password);
}

}
