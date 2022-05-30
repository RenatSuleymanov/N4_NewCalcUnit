public class Parse {
    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //---проверка корректности оператора, должно быть: +-*/
    public boolean checkOperator(String op){
        return "*".equals(op) || "/".equals(op) || "+".equals(op) || "-".equals(op);
    }

}