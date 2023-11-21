package org.cw.blog.service;

import org.cw.blog.bean.User;
import org.cw.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public User search() {
        return  userMapper.search();
    }
}
