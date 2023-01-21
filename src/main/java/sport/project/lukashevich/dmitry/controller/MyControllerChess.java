package sport.project.lukashevich.dmitry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sport.project.lukashevich.dmitry.entity.Chess;
import sport.project.lukashevich.dmitry.service.SportService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/sport_project")
public class MyControllerChess {
    @Autowired
    private SportService sportService;
    @RequestMapping("/showChess")
    public String showAllChess(Model model){
        List<Chess> chessList=sportService.getChess();
        model.addAttribute("chessList",chessList);
        return "all-chess-players";
    }
    @RequestMapping("/addNewChessPlayer")
    public String addChessPlayer( Model model){
        Chess chess=new Chess();
        model.addAttribute("chess",chess);
        return "add-chess";
    }
    @RequestMapping("/saveChess")
    public String saveChessPlayer( @Valid @ModelAttribute("chess") Chess chess,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
          return "add-chess";
        }else {
        sportService.saveChess(chess);
        return "redirect:/";}
   }
    @RequestMapping("/updateChessInfo")
    public String updateChess(@RequestParam("chId") int id, Model model){
        Chess chess=sportService.getChess(id);
        model.addAttribute("chess",chess);
        return "add-chess";
    }
    @RequestMapping("/deleteChessInfo")
    public String deleteChess(@RequestParam("chId") int id){
        sportService.deleteChess(id);
        return "redirect:/";
    }
}
