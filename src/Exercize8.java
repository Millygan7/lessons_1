 public class Exercize8{
     public static void main(String[] args) {
         int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

         for (int i = 0; i < numbers.length; i++) {
             if (numbers[i] < 6) {
                 numbers[i] *= 2;
             }
         }
         System.out.println("Массив после изменения");
         for (int num : numbers) {
             System.out.println(num);
         }
     }
 }



