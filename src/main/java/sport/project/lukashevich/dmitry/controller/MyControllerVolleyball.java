package sport.project.lukashevich.dmitry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sport.project.lukashevich.dmitry.entity.Chess;
import sport.project.lukashevich.dmitry.entity.Footbal;
import sport.project.lukashevich.dmitry.entity.Volleyball;
import sport.project.lukashevich.dmitry.service.SportService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/sport_project")
public class MyControllerVolleyball {
    @Autowired
    private SportService sportService;
    @RequestMapping("/showVolleybal")
    public String showAllVolleyball(Model model){
        List<Volleyball> volleybalList=sportService.getVolleyball();
        model.addAttribute("voleybalList",volleybalList);
        return "all-voleybal-players";
}
@RequestMapping("/addNewVolleyballPlayer")
    public String addVolleyball(Model model){
        Volleyball volleyball=new Volleyball();
        model.addAttribute("volleyball",volleyball);
        return "add-volleyball";
    }
    @RequestMapping("/saveVolleyball")
    public String saveChessPlayer(@Valid @ModelAttribute("volleyball") Volleyball volleyball, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "add-volleyball";
        }else {
        sportService.saveVolleyball(volleyball);
        return "redirect:/";}
    }
    @RequestMapping("/updateVolleyballInfo")
    public String updateVolleyball(@RequestParam("valId") int id, Model model){
        Volleyball volleyball=sportService.getVolleyball(id);
        model.addAttribute("volleyball",volleyball);
        return "add-volleyball";
    }
    @RequestMapping("/deleteVolleyballInfo")
    public String deleteVolleyball(@RequestParam("valId") int id){
        sportService.deleteVolleyball(id);
        return "redirect:/";
    }
}
