package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceInterfeis calculatorService;
    private CalculatorController(CalculatorServiceInterfeis calculatorService) {
        this.calculatorService=calculatorService;
    }
    @GetMapping
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }


    @GetMapping(path = "/plus")
    public String plus(@RequestParam(required = false, name = "num1") Integer num1,
                       @RequestParam(required = false, name = "num2") Integer num2)
    {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(required = false, name = "num1") Integer num1,
                        @RequestParam(required = false, name = "num2") Integer num2) {
        return calculatorService.minus(num1,num2);

    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(required = false, name = "num1") Integer num1,
                        @RequestParam(required = false, name = "num2") Integer num2) {
        return calculatorService.divide(num1,num2);

    }@GetMapping(path = "/multiply")
    public String multiply(@RequestParam(required = false, name = "num1")Integer num1,
                        @RequestParam(required = false, name = "num2") Integer num2) {
        return calculatorService.multiply(num1,num2);

    }


}


