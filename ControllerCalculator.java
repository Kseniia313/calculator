package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCalculator{
    @GetMapping(path ="/calculator" )
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path ="/calculator/plus?num1=5&num2=5" )
    public String plus(@RequestParam("num1")String num1) {
        return "5 + 5 = 10";
    }


}

