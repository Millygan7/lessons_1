public class Exercize9 {
    static void main(String[] args) {
        int year = 2024;
        boolean a = year == 400 % 4;
        if (a) {
            System.out.println("Не високосный");
        } else if (100 % 4 == 0) {
            System.out.println("Високосный");
        }
    }
}