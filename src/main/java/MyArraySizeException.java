public class MyArraySizeException extends RuntimeException {

    MyArraySizeException() {
        super("Размер массива не равен 4*4");
    }
}
