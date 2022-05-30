import java.util.Arrays;
import java.util.List;

public class Calc {
    private double num1, num2;     //числа в выражении
    private String operator;    //оператор в выражении, допускается: +-*/

    //---выполнение арифметического выражения
    private double calcExp(double n1, String op, double n2){
        double res;
        switch (op) {
            case "+":
                res = n1+n2;
                break;
            case "-":
                res = n1-n2;
                break;
            case "*":
                res = n1*n2;
                break;
            case "/":
                res = n1/n2;
                break;
            default:
                throw new AssertionError();
        }
        return res;
    }

    //---public метод с проверками и с выводом результата
    public String result(String exp) throws CalcException{
        Parse parse = new Parse();

        //---разбиваем исходное выражение String по разделителю " "
        List<String> expItems = Arrays.asList(exp.split(" "));

        //---проверка, что создалось 3 элемента: число1, оператор, число2, иначе исключение
        if (expItems.size()!=3){
            throw new CalcException("ERROR. Выражение должно иметь вид: \"Число1 Операция Число2\", разделенные пробелом...");
        }

        //--- проверка оператора, должен быть: + - * /
        if (parse.checkOperator(expItems.get(1))){
            operator = expItems.get(1);
        } else {
            throw new CalcException("ERROR. Оператор '" + expItems.get(1) + "' не корректен, должен быть: + - * / ");
        }

        //--- получаем результат
        double res = calcExp(Double.parseDouble(expItems.get(0)), expItems.get(1), Double.parseDouble(expItems.get(2)));
        return String.valueOf(res);
    }

}