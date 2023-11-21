package org.cw.blog.controller;

import org.cw.blog.bean.User;
import org.cw.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    private User search(){
        User user = userService.search();
        System.out.println(user.getId());
      return   userService.search();
    }
}
