package com.example.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/getString")
    public String getMessage(){
        return "Rom Netanel Vinnitski";
    }
}
