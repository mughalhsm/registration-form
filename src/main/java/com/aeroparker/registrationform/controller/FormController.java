package com.aeroparker.registrationform.controller;

import com.aeroparker.registrationform.entity.CustomerDetails;
import com.aeroparker.registrationform.repositry.CustomerRepositry;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @Autowired
    private CustomerRepositry customerRepo;
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute CustomerDetails customer, HttpSession session) {
        System.out.println((customer));

        customerRepo.save(customer);
        session.setAttribute("message", "Customer Registered Successfully");


        return "redirect:/";
    }


}
