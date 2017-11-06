package com.soa.user.facade;

import com.soa.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LiuMei
 * @date 2017-11-06.
 */
@Service
public class UserFacadeImpl implements UserFacade {

    @Resource
    private UserService userService;

    public Integer login(String userName, String password) {
        return userService.login(userName,password);
    }

}
