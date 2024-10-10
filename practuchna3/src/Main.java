import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ціле число:");
        int intValue = scanner.nextInt();

        System.out.println("Введіть число з плаваючою точкою:");
        double doubleValue = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Введіть строку:");
        String stringValue = scanner.nextLine();

        System.out.println("Введіть логічне значення (true/false):");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("\n1. Стандартний System.out.println:");
        System.out.println("Ціле: " + intValue + ", Число з плаваючою точкою: " + doubleValue + ", Строка: " + stringValue + ", Логічне: " + booleanValue);

        System.out.println("\n2. Використання MessageFormatter:");
        String template = "Ціле число: {0}, Число з плаваючою точкою: {1}, Строка: {2}, Логічне: {3}";
        String formattedMessage = MessageFormat.format(template, intValue, doubleValue, stringValue, booleanValue);
        System.out.println(formattedMessage);

        System.out.println("\n3. Використання System.out.format з різними специфікаторами:");
        System.out.format("Ціле число (десяткова система): %d%n", intValue);
        System.out.format("Ціле число (шістнадцяткова система): %x%n", intValue);
        System.out.format("Число з плаваючою точкою: %.2f%n", doubleValue);
        System.out.format("Строка: %-10s (вирівняно по лівому краю)%n", stringValue);
        System.out.format("Логічне значення: %b%n", booleanValue);

        System.out.println("\n4. Виведення з вирівнюванням:");
        System.out.format("%10d (вирівняно по правому краю)%n", intValue);
        System.out.format("%-10d (вирівняно по лівому краю)%n", intValue);

        System.out.println("\n5. Форматоване виведення з фіксованою кількістю символів після крапки:");
        System.out.format("%.4f (4 знаки після коми)%n", doubleValue);
    }
}