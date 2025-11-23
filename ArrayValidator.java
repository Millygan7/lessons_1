class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) { super(message); } }

public class ArrayValidator {
    public static void validateArray(String[][] array) throws MyArraySizeException {


        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4.");
        }

    }

    public static void main(String[] args) {
        String[][] validArray = {{"1", "2", "3", "4" }, {"5", "6", "7", "8" }, {"9", "10", "11", "12" }, {"13", "14", "15", "16" }};



        String[][] invalidArray = {{"1", "2", "3" }, {"4", "5", "6" }, {"7", "8", "9" }};
        try {
            // Проверяем корректный массив
            validateArray(validArray);
            System.out.println("Корректный массив 4x4 принятт");
        } catch (MyArraySizeException e) {
            System.out.println("Исключение"+ e.getMessage());
        }

        try {
            // Проверяем некорректный массив
            validateArray(invalidArray);
        } catch (MyArraySizeException e) {
            System.out.println("Исключение"+ e.getMessage());
        }
    }
}




















