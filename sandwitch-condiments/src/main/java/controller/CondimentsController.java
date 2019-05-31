package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentsController {

    @GetMapping("")
    public String index(){

        return "index";
    }

    @PostMapping("/condiments")
    public String displayCondiments(@RequestParam(value = "condiment", required = false) String[] condiments, Model model){

        String result = "";

        if(condiments == null){
            return "error";
        }

        for(int i = 0; i < condiments.length; i++){
            result = result + condiments[i] + " ";
        }

        model.addAttribute("result",result);

        return "display";
    }
}
