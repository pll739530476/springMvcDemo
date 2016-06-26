package com.springMvc.pll.controller;

import com.springMvc.pll.entity.User;
import com.springMvc.pll.service.UserService;
import com.springMvc.pll.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.TestPropertySource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {
    @Autowired
    UserService userService;
	@RequestMapping(value="index.do")
    public void index_jsp(Model model){
        User user=userService.selectById(1);
        System.out.println("+++++++++++="+user.toString());
        model.addAttribute("str0121", "hi SpringMvc");
        System.out.println("index.jsp");    
    }
}
