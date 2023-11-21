package org.cw.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.cw.blog.bean.User;

@Mapper
public interface UserMapper {
    public User search();
}
