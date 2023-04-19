package com.aeroparker.registrationform.controller;

import com.aeroparker.registrationform.entity.CustomerDetails;
import com.aeroparker.registrationform.repositry.CustomerRepositry;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepositry customerRepo;
    @GetMapping("/registration")
    public String home() {
        return "index";
    }

    @PostMapping("/registration")
    public String register(@ModelAttribute @Valid CustomerDetails customer, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            return "validation-error";
        } else {
            try {
                customerRepo.save(customer);
                return "successful";
            } catch (DataIntegrityViolationException e) {
                return "email-exists";
            } catch (Exception e) {
            return "unknown-error";
            }
        }
    }
}
