public class CalcLogger implements Logger {
    private Logger logger;

    public CalcLogger(Logger logger) {

        this.logger = logger;
    }

    private void logOperation(String operation, ComplexNumber complex1, ComplexNumber complex2, ComplexNumber result) {
        String message = "Результат: " + complex1 + " " + operation + " " + complex2 + " = " + result;
        logger.log(message);
    }

    @Override
    public void log(String message) {
        logger.log(message);
    }

    public void logAddition(ComplexNumber complex1, ComplexNumber complex2, ComplexNumber result) {
        logOperation("+", complex1, complex2, result);
    }

    public void logSubtraction(ComplexNumber complex1, ComplexNumber complex2, ComplexNumber result) {
        logOperation("-", complex1, complex2, result);
    }

    public void logMultiply(ComplexNumber complex1, ComplexNumber complex2, ComplexNumber result) {
        logOperation("*", complex1, complex2, result);
    }

    public void logDivision(ComplexNumber complex1, ComplexNumber complex2, ComplexNumber result) {
        logOperation("/", complex1, complex2, result);
    }

}