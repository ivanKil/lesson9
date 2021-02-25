import java.util.Arrays;

public class Les9 {
    private static String stringArray[][] = new String[][]{
            new String[]{"1", "1", "1", "1"},
            new String[]{"1", "1", "1", "1"},
            new String[]{"1", "1", "1", "1"},
            new String[]{"1", "1", "1", "1"}};

    public static void main(String[] args) {
        printArray();
        try {
            printSumElements(stringArray);
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println("Ошибка: " + e);
        }

        stringArray[2][3] = "K";
        printArray();
        try {
            printSumElements(stringArray);
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println("Ошибка: " + e);
        }

        stringArray[2] = new String[]{"1", "1", "1", "1", "1"};
        printArray();
        try {
            printSumElements(stringArray);
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println("Ошибка: " + e);
        }

    }

    private static void printSumElements(String[][] arr) {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }

        for (String[] subarr : arr) {
            if (subarr.length != 4) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(j + 1, i + 1, arr[i][j]);
                }
            }
        }

        System.out.println("Сумма элементов массива: " + sum);
    }

    private static void printArray() {
        System.out.println("\nМассив:");
        for (String[] subArr : stringArray) {
            System.out.println(Arrays.toString(subArr));
        }
    }
}