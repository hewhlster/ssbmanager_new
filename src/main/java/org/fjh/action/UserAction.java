package org.fjh.action;

import javax.servlet.http.HttpSession;

import org.fjh.entity.User;
import org.fjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserAction {

	@Autowired
	private UserService userService ;
	
	@RequestMapping("/login")
	public ModelAndView adminLogin(HttpSession session,ModelAndView mv,User user){
		User loginedUser=userService.adminLogin(user);
		if( loginedUser!=null){
			mv.setViewName("main");
			session.setAttribute("logineduser", loginedUser);
		} else {
			mv.setViewName("login");
			session.setAttribute("errormsg", "用户名或密码不对！");
		}
		
		System.out.println("~~~~~adminLogin~~~~~");
		return mv;
	}
		
	@RequestMapping("/index")
	public String index(){
		return "login";
	}
	
	@RequestMapping("/main")
	public String mian(){
		return "main";
	}
}
