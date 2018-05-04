package com.rong.ssh.login.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rong.ssh.login.entity.UserDTO;
import com.rong.ssh.login.service.LoginService;
/** 
 * @version  
 * @time 2018-2-28 ����5:57:07 
 * @describe:������
 */
@Controller  //ע��Ϊ������
@RequestMapping(value="/login")    //�ػ����/login������
public class LoginController {

	@Autowired
    LoginService loginService;  //ע��service��
	
    @RequestMapping(method=RequestMethod.GET)
    public String get(){  //��������һ��ҳ��
        return "login";  //����ָ��login.jspҳ��
    }

    @RequestMapping(method=RequestMethod.POST)
    public String post(UserDTO user){  //���������û��ĵ�½����
        return "login_success";
    }
}