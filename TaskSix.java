import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; ++i) {
            if(i % 2 != 1)
                continue;
            System.out.format("%d " , i);
        }
    }
}
