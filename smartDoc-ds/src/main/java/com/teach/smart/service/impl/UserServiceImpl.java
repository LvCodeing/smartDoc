package com.teach.smart.service.impl;

import com.teach.smart.service.IUserService;
import org.springframework.stereotype.Service;
import java.util.Calendar;

/**
 * author zoush
 * CreateTime 2018-03-16 22:09
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    public String test(String name) {
        return String.format("%s:%s登录系统......!",name, Calendar.getInstance().getTime());
    }
}
