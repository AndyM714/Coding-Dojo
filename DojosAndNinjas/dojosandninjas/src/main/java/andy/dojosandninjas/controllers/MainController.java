package andy.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import andy.dojosandninjas.dojos_ninjas.models.Dojo;
import andy.dojosandninjas.dojos_ninjas.models.Ninja;
import andy.dojosandninjas.dojos_ninjas.services.DojoService;
import andy.dojosandninjas.dojos_ninjas.services.NinjaService;


@Controller
public class MainController {

    @Autowired DojoService dojoService;

    @RequestMapping(value = {"/dojos/new", "/"})
   
    public String newDojo(@ModelAttribute("dojo")Dojo dojo) {
        
        return "dojos/new.jsp";
    }
 
    @PostMapping("/dojos")
    public String createDojo(@ModelAttribute("dojo")Dojo dojo) {
        // -> pass in dojo got from the DB
        dojoService.createDojo(dojo);
        return "redirect:/";
    }
    
    // ~ Ninjas
    @RequestMapping("/ninjas/new")
    public String newDojo(@ModelAttribute("ninja")Ninja ninja, Model model) {
        List<Dojo> dojos = dojoService.getAllDojos();
        model.addAttribute("dojos", dojos);
        return "ninjas/new.jsp";
    }


    @PostMapping("/createninja")
    public String ninjas(@Valid @ModelAttribute("ninja")Ninja ninja,BindingResult result) {
        if(result.hasErrors()) {
            return "ninjas/new.jsp";
        }else {
            ninjaService.createNinja(ninja);
            return "redirect:/show/" + ninja.getDojo().getId();
        }
    }

    
    @GetMapping("/dojos/{dojo_id}")
    
    public String show(@PathVariable("dojo_id")Long id, Model model) {
        Dojo dojo = dojoService.getOneDojo(id);
        model.addAttribute("dojo", dojo);
        return "dojos/show.jsp";
    }
}