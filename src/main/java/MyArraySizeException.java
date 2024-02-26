public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException(String s) {
        super(s);
    }
    public MyArraySizeException(int index) {
        super(index);
    }
}
