package tddcalc;

public class Calc {
    public static int run(String input) {
        String[] tokens = input.split(" ");
        int result = Integer.parseInt(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int number = Integer.parseInt(tokens[i + 1]);

            switch (operator) {
                case "+" -> result += number;
                case "-" -> result -= number;
                case "*" -> result *= number;
                case "/" -> result /= number;
            }
        }

        return result;
    }
}