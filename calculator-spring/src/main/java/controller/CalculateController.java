package controller;


import model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {

    @PostMapping("/calculate")
    public String displayCalculate(@RequestParam float firstOperand, @RequestParam float secondOperand, @RequestParam String operator, Model model) {

        char op = operator.charAt(0);
        String message = "";
        try{
            float result = Calculator.calculate(firstOperand, secondOperand, op);
            message = "The result of " + firstOperand + " " +  op + " " + secondOperand + " is " + result;

        }catch (Exception ex){
             message = ex.getMessage();
        }

        model.addAttribute("message", message);



        return "display";
    }
}
