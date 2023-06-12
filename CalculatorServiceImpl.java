package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServiceInterfeis{

    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer num1, Integer num2) {
        if ((num1 == null) || (num2 == null)) {
            return "Вам необходимо ввести число";
        } else return num1 + " + " + num2 + " = " + (num1 + num2);
    }

        public String minus (Integer num1, Integer num2){
            if ((num1 == null) || (num2 == null)) {
                return "Вам необходимо ввести число";}
          else  return num1 + " - " + num2 + " = " + (num1 - num2);
        }
        public String divide (Integer num1, Integer num2){
                if ((num1 == 0) || (num2 == 0)) {
                    return "ArithmeticException";}
                else return num1 + " / " + num2 + " = " + (num1 / num2);
        }
        public String multiply (Integer num1, Integer num2){
            if ((num1 ==null) || (num2 == null)) {
                return "Вам необходимо ввести число";}
          else return num1 + " * " + num2 + " = " + (num1 * num2);
        }
    }





