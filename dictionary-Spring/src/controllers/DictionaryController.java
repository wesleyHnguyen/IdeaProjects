package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    @PostMapping("/dictionary")
    public String translating(@RequestParam String search, Model model){
        Map<String,String> dict = new HashMap<>();

        dict.put("hello", "xin chao");
        dict.put("how", "Thế nào");
        dict.put("book", "Quyển vở");
        dict.put("computer", "Máy tính");

        String result = dict.get(search);

        if(result != null){
            model.addAttribute("search" ,search);
            model.addAttribute("result",result);
        } else {
             result = "not found";
             model.addAttribute("result",result);
        }
        return "translate";
    }

}
