package com.mkyong.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "ajax";
    }


    @GetMapping("/swagger")
    public void redirectToSwagger(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui.html");
	}

}