

public class Calculator {
    public static void main(String[] args) {

        double firstValue = 10;
        double nextValue = 3;
        String operator = "+";

        Calculation calc = new Calculation();

        switch (operator){
            case "+":
                double add = calc.add(firstValue,nextValue);
                System.out.println(firstValue+" + "+nextValue+" = "+add);
                break;

            case "-":
                double subtraction = calc.subtraction(firstValue,nextValue);
                System.out.println(firstValue+" - "+nextValue+" = "+subtraction);
                break;

            case "*":
                double multiplycation = calc.multiplication(firstValue,nextValue);
                System.out.println(firstValue+" * "+nextValue+" = "+multiplycation);
                break;

            case "/":
                double division = calc.division(firstValue,nextValue);
                System.out.println(firstValue+" / "+nextValue+" = "+division);
                break;

            case "%":
                double modulo = calc.modulo(firstValue,nextValue);
                System.out.println(firstValue+" % "+nextValue+" = "+modulo);
                break;

    }
    }
}
