package com.portal.portalsalud.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({ "/", "/index", "/home" })
    public String index() {
        return "home";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "views/loginPage";
    }

    /* Rutas Login */
    @GetMapping("/login-medico")
    public String loginMedico() {
        return "views/login-medico-paciente/login-medico";
    }

    @GetMapping("/login-paciente")
    public String loginPaciente() {
        return "views/login-medico-paciente/login-paciente";
    }

    /* Rutas Register */
    @GetMapping("/register-medico")
    public String registerMedico() {
        return "views/register-medico-paciente/register-medico";
    }

    @GetMapping("/register-paciente")
    public String registerPaciente() {
        return "views/register-medico-paciente/register-paciente";
    }

}
