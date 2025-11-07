public class Exercize10 {
        public static void main(String[] args) {
            int[] numbers = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 0) {
                    numbers[i] = 1;
                } else {
                    numbers[i] = 0;
                }
            }
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }

