public final class Calculator {
    private Calculator() {
    }

    public static double add(double left, double right) {
        return left + right;
    }

    public static double subtract(double left, double right) {
        return left - right;
    }

    public static double multiply(double left, double right) {
        return left * right;
    }

    public static double divide(double left, double right) {
        if (right == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return left / right;
    }
}
