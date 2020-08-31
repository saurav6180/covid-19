package com.test.controller;

import com.test.dao.CustomerDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @Autowired
    CustomerDaoImpl customerDao;

    @RequestMapping("/home")
    public String home(Model model)

    {    model.addAttribute("data",customerDao.save());
        return "home";
    }

}
