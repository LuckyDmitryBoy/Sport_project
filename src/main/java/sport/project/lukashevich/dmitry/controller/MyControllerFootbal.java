package sport.project.lukashevich.dmitry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sport.project.lukashevich.dmitry.dao.SportDAO;
import sport.project.lukashevich.dmitry.entity.Chess;
import sport.project.lukashevich.dmitry.entity.Footbal;
import sport.project.lukashevich.dmitry.entity.Volleyball;
import sport.project.lukashevich.dmitry.service.SportService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/sport_project")
public class MyControllerFootbal {
    @Autowired
    private SportService sportService;

@RequestMapping("/showFootbal")
    public String showAllFottbal(Model model){
    List<Footbal> footbalList=sportService.getFootball();
    model.addAttribute("footballList",footbalList);
    return "all-footbal-players";}
@RequestMapping("/addNewFootballPlayer")
public String addFootball(Model model){
    Footbal footbal=new Footbal();
    model.addAttribute("football",footbal);
    return "add-football";
}
    @RequestMapping("/saveFootball")
    public String saveFootballPlayer(@Valid @ModelAttribute("football") Footbal footbal, BindingResult bindingResult){
    if (bindingResult.hasErrors()){
        return "add-football";
    }else {
    sportService.saveFootball(footbal);
        return "redirect:/";}
    }
    @RequestMapping("/updateFootballInfo")
    public String updateFootball(@RequestParam("fotId") int id, Model model){
        Footbal footbal=sportService.getFootball(id);
        model.addAttribute("football",footbal);
        return "add-football";
}
    @RequestMapping("/deleteFootballInfo")
    public String deleteFootball(@RequestParam("fotId") int id){
        sportService.deleteFootball(id);
        return "redirect:/";
    }
}

