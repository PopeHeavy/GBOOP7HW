import java.util.Scanner;

public class ComplexCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CalcLogger logger = new CalcLogger(new ViewLogger());
        ComplexNumber complex1;
        ComplexNumber complex2;
        ComplexNumber result;
        float a;
        float b;
        int option = 0;
        // Главное меню калькулятора

        while(option != 5){
            System.out.println("\nВыберите действие\n");
            System.out.println("1: Сложение");
            System.out.println("2: Вычитание");
            System.out.println("3: Умножение");
            System.out.println("4: Деление");
            System.out.println("5: Выход\n");
            option = input.nextInt();

            if(option == 1){
                System.out.println("\ni = (-1)^1/2,\n");
                System.out.println("Сложение: (a + bi) + (c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("a = " + a);
                System.out.println("Введите b:");
                b = input.nextFloat();
                System.out.println("b = " + b);
                complex1 = new ComplexNumber(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("c = " + a);
                System.out.println("Введите d:");
                b = input.nextFloat();
                System.out.println("d = " + b);
                complex2 = new ComplexNumber(a, b);
                result = complex1.addition(complex2);
                logger.logAddition(complex1, complex2, result);
            }

            if(option == 2){
                System.out.println("\ni = (-1)^1/2,\n");
                System.out.println("Вычитание: (a + bi) - (c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("a = " + a);
                System.out.println("Введите b:");
                b = input.nextFloat();
                System.out.println("b = " + b);
                complex1 = new ComplexNumber(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("c = " + a);
                System.out.println("Введите d:");
                b = input.nextFloat();
                System.out.println("d = " + b);
                complex2 = new ComplexNumber(a, b);
                result = complex1.subtract(complex2);
                logger.logSubtraction(complex1, complex2, result);
            }

            if(option == 3){
                System.out.println("\ni = (-1)^1/2,\n");
                System.out.println("Умножение: (a + bi)(c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("a = " + a);
                System.out.println("Введите b:");
                b = input.nextFloat();
                System.out.println("b = " + b);
                complex1 = new ComplexNumber(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("c = " + a);
                System.out.println("Введите d:");
                b = input.nextFloat();
                System.out.println("d = " + b);
                complex2 = new ComplexNumber(a, b);
                result = complex1.multiply(complex2);
                logger.logMultiply(complex1, complex2, result);
            }

            if(option == 4){
                System.out.println("\ni = (-1)^1/2,\n");
                System.out.println("Деление: (a + bi)/(c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("a = " + a);
                System.out.println("Введите b:");
                b = input.nextFloat();
                System.out.println("b = " + b);
                complex1 = new ComplexNumber(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("c = " + a);
                System.out.println("Введите d:");
                b = input.nextFloat();
                System.out.println("d = " + b);
                complex2 = new ComplexNumber(a, b);
                result = complex1.divide(complex2);
                logger.logDivision(complex1, complex2, result);
            }
        }
        System.out.println("\nДо свидания\n");
    }
}