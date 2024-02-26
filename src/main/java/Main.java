import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"5", "7", "3", "2"}, {"11", "187", "19", "3"}, {"9", "198", "725", "56"}, {"48", "76", "124", "1138"}}; //2611
        String[][] array2 = {{"5", "6", "3", "2"}, {"12", "21", "13"}, {"2", "10", "8", "4"}, {"6", "3", "2", "0"}};
        String[][] array3 = {{"5", "6", "3", "2"}, {"6", "3", "2", "0"}};
        String[][] array4 = {{"5", "7", "3", "2"}, {"11", "187", "Abba", "3"}, {"def", "198", "hh b", "56"}, {"48", "76", "124", "1138"}};
        try {
            System.out.println(checkArray(array));
            //System.out.println(checkArray(array2));
            //System.out.println(checkArray(array3));
            System.out.println(checkArray(array4));
        }
        catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception);
        }
    }
    static long checkArray(String[][] array) {
        long result = 0;
        if (array.length != 4) {
            throw new MyArraySizeException(array.length);
        }
        else {
            for (int i = 0; i < 4; i++) {
                if (array[i].length != 4) {
                    throw  new MyArraySizeException("Line: " + (i + 1) +", Index out of range: " + array[i].length);
                }
                for (int j = 0; j < array[i].length; j++) {
                    if (!isNumeric(array[i][j])) {
                        throw new MyArrayDataException("Illegal argument in the line: " + (i + 1) + " field: "
                                + (j + 1) + " --" + array[i][j] + "--");
                    }
                    result += Integer.parseInt(array[i][j]);
                }
            }
        }
        return result;
    }
    static boolean isNumeric(String strNum) {
        Pattern pattern = Pattern.compile("\\d+");
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
