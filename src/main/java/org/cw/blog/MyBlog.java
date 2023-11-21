package org.cw.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.cw.blog.mapper")
public class MyBlog {
    public static void main(String[] args) {
        SpringApplication.run(MyBlog.class,args);
    }
}