package africa.ozi.files.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("welcome")
    public String welcomeFirstTimer(){
        return "Welcome to my rest controller." +
                "This is how it is done";
    }
}
