package com.beyondprogramming.controllers;

import com.beyondprogramming.command.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @GetMapping("login")
    public String login(Model model){

        model.addAttribute("loginCommand", new LoginCommand());

        return "loginform";
    }

    @GetMapping("logout-success")
    public String yourLoggedOut(){

        return "logout-success";
    }

    //@PostMapping(value = "/dologin")
    public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult){
/*      Check of the command and bindingResult object
        System.out.println(loginCommand.toString());
        System.out.println(bindingResult.hasErrors());*/
        if(bindingResult.hasErrors()){
            return "loginform";
        }

        return "redirect:index";
    }

}
