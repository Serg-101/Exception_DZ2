import java.util.Scanner;
/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Введите число Float (например 3,1)");
        Scanner scanner = new Scanner(System.in);
        while (!extracted(scanner)){}
        scanner.close();
    }

    private static Boolean extracted(Scanner scanner) {
        try{
            if (scanner.hasNextFloat()){
                Float a = scanner.nextFloat();
                System.out.println(Float.toString(a));
                return true;
            }
            else {
                System.out.println("Вы ввели не правильный формат данных. Введите значение float (Например 3,1)");
                scanner.nextLine();
                return false;
            }
        }
        catch (Exception e){
            System.out.println("Вы ввели не правильный формат данных. Введите значение float (Например 3,1) exc");
            return false;
        }
    }


}