package com.zjm.Dao;

import com.zjm.entity.User;

public interface IUserDao {
    User checkUser(String userName, String password);

    int register(User user);
}
