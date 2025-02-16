import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TaskOne {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scaner.nextInt();
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (isLeapYear) {
            System.out.println(year + " Вискокосный год ");
        } else {
            System.out.println(year + " Не високосный год ");
        }
    }
}
