package hafta5.day;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir gün giriniz : ");
        String input = scanner.nextLine().toUpperCase();

        Day selectedDay = Day.valueOf(input);
        System.out.println(selectedDay + " günü çalışma saatleri: " + selectedDay.getWorkingHours());

    }
}