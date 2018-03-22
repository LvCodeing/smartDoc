package com.teach.smart.controller;

import com.teach.smart.remote.IUserRemote;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.Calendar;

/**
 * author zoush
 * CreateTime 2018-03-16 22:01
 */

@Controller
@RequestMapping("user")
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);

    @Resource
    private IUserRemote userRemote;

    @RequestMapping("/test/{name}")
    @ResponseBody
    public String test(@PathVariable String name){

        logger.info(String.format("%s[%s]登录系统", Calendar.getInstance().getTime(),name));

        return userRemote.test(name);
    }


}
