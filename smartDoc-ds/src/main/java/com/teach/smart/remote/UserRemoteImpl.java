package com.teach.smart.remote;

import com.teach.smart.service.IUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * author zoush
 * CreateTime 2018-03-15 23:18
 */

@Service("userRemote")
public class UserRemoteImpl implements IUserRemote{

    @Resource
    private IUserService userService;

    public String test(String name) {
        return userService.test(name);
    }
}
