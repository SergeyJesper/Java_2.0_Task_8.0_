import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Zyablitsev Sergey
 */
public class MainClassCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действие, которое хотите произвести: 1 - Калькулятор, 2 - Операции с массивом");
        int a;
        double x, y;
        a = sc.nextInt();

        if (a == 1) {
            Calc calc = new Calc();
            System.out.println("Программа калькулятор. Введите первое число");
            try {
                if (sc.hasNext()) {
                    x = sc.nextDouble();
                    calc.setX(x);
                    System.out.println("Введите второе число");
                    y = sc.nextDouble();
                    calc.setY(y);
                }
                System.out.println("Выберите дейтвие: 1 - Сложение, 2 - Вычитание, 3 - Умножение, 4 - Деление");
                a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Результат операции: " + calc.getAdd());
                        break;
                    case 2:
                        System.out.println("Результат операции: " + calc.getSub());
                        break;
                    case 3:
                        System.out.println("Результат операции: " + calc.getMul());
                        break;
                    case 4:
                        System.out.println("Результат операции: " + calc.getDiv());
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Это не число. Перезапустите программу");
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль запрещено");
            }
        }else if (a == 2){
            ArrayClass arrayClass = new ArrayClass();
            System.out.println("Введите длину массива: ");
            int l = sc.nextInt();
            arrayClass.crArray(l);

        }
    }
}
