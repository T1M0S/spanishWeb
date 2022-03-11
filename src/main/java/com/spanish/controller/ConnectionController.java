package com.spanish.controller;

import com.spanish.domain.Word;
import com.spanish.service.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConnectionController {
    private final ConnectionService connectionService;

    @Autowired
    public ConnectionController(ConnectionService connectionService) {
        this.connectionService = connectionService;
    }

    @GetMapping("/word/{id}")
    public Word sayHello(@PathVariable Long id) {
        return connectionService.getWordById(id);
    }

    @GetMapping("/api")
    public List<Word> getAll() {
        return connectionService.getAll();
    }


}
