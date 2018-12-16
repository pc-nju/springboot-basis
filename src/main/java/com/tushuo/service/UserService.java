package com.tushuo.service;

import com.tushuo.dao.UserDao;
import com.tushuo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 咸鱼
 * @date 2018/12/13 22:41
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserDao userDao;

    public boolean save(User user) {
        return userDao.insertUser(user) == 1;
    }
}
