public class MyArrayDataException extends NumberFormatException {
    
    MyArrayDataException(int i, int j, String cellData) {
        super("Ошибка преобразования в ячейке [" + i + "][" + j + "], значение '" + cellData + "'");
    }
}
