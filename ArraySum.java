class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) { super(message); } }
  public class ArraySum { public static int sumArray(String[][] array) throws MyArrayDataException {
    int sum = 0;
    for (int i = 0; i < array.length; i++){
        for (int j = 0; j < array[i].length; j++) {
            try {
                Integer.parseInt(array[i][j]); }
            catch (NumberFormatException e) {
                throw  new MyArrayDataException("Некорректные данные в ячейке [" + i + "][" + j + "]: \"" + array[i][j] + "\""); } } }
    return sum; }
    public static void main(String[] args) {
        String[][] array = { {"1", "2", "3"}, {"4", "five", "6"},{"7", "8", "9"} };
        try {
            int result = sumArray(array);
            System.out.println("Сумма элементов массива: " + result);
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getMessage()); } } }











