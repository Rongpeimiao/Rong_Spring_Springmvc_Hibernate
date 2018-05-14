package com.rong.ssh.login.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    	 if (loginService.login(user.getUserName(), user.getPassword())==1) {
             return "login_success";  //登陆成功，跳转到login_success.jsp页面
         }
         return "login";
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/getmap")
    @ResponseBody
    public Map<String, Object>  getmap(){  //用来处理用户的登陆请求
    	  Map<String, Object> maps=new HashMap<>();
    	  maps.put("悟空", "是个猴子");
        return maps;
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/getuser")
    @ResponseBody
    public UserDTO  getuse(){  //用来处理用户的登陆请求
    	 UserDTO u=new UserDTO();
    	 u.setUserName("三藏");
        return u;
    }
    @RequestMapping(value="/getList")
    @ResponseBody
    public List<Map<String, Object>>  getjson(){  //用来处理用户的登陆请求
    	 Map<String, Object> maps=new HashMap<>();
   	     maps.put("八戒","是个猪");
   	     List<Map<String, Object>>  ls=new ArrayList<Map<String, Object>>();
   	     ls.add(maps);
        return ls;
    }
}