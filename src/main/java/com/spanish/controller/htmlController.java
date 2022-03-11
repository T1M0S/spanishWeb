package com.spanish.controller;

import com.spanish.domain.Word;
import com.spanish.service.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gaga")
public class htmlController {
    ConnectionService connectionService;

    @Autowired
    public htmlController(ConnectionService connectionService) {
        this.connectionService = connectionService;
    }

    @GetMapping("/home")
    public String welcome(Model model) {
        Word word = connectionService.randomWord();
        model.addAttribute("word", word);

        return "hello";
    }
}
