package com.rong.ssh.login.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rong.ssh.login.entity.UserDTO;
import com.rong.ssh.login.service.LoginService;
/** 
 * @version  
 * @time 2018-2-28 下午5:57:07 
 * @describe:控制器
 */
@Controller  //注解为控制器
@RequestMapping(value="/login")    //截获带有/login的请求
public class LoginController {

	@Autowired
    LoginService loginService;  //注入service层
	
    @RequestMapping(method=RequestMethod.GET)
    public String get(){  //用来返回一个页面
        return "login";  //返回指向login.jsp页面
    }

    @RequestMapping(method=RequestMethod.POST)
    public String post(UserDTO user){  //用来处理用户的登陆请求
        return "login_success";
    }
}