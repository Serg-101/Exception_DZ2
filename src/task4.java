import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Ведите не пустую строку");
        Scanner scanner = new Scanner(System.in);
        while (extracted(scanner)){}
        scanner.close();
    }
    private static Boolean extracted(Scanner scanner) {
        String st = scanner.nextLine();
        if(st.isEmpty()){
            System.out.println("The string you entered is empty! Please enter not empty value");
            return true;
        }
        else {
            System.out.println("Alright!");
            return false;
        }
        }
    }

