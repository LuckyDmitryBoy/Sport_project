package sport.project.lukashevich.dmitry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyMainController {
    @RequestMapping("/")
    public String mainPage(){
        return "main-page";
    }
}
