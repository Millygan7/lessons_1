public class ArrayIndexOutOfBounds extends Throwable {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            // Пытаемся получить доступ к элементу с индексом 5 (вне диапазона)
            int number = numbers[5]; // Это вызовет исключение
            System.out.println("Элемент массива" + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Обрабатываем исключение
            System.out.println("Исключение" + e.getMessage());
            System.out.println("Вы пытались получить доступ к элементу с недопустимым индексом.");
        }
    }
}
