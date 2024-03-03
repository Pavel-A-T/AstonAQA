import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filename = "1.csv";
        String separator = "; ";
        AppData appData = new AppData();
        AppData loadFromFile = new AppData();
        String[] headers = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}, {700, 800, 900}, {1, 2, 30}};
        appData.setData(data);
        appData.setHeader(headers);
        if (save(appData, filename, separator)) {
            System.out.println("Файл " + filename + " сохранён");
        }
        if (loadFromFile(loadFromFile, filename, separator)) {
            System.out.println(loadFromFile);
        }
    }

    public static boolean save(AppData data, String fileName, String separator) {
        try (DataOutputStream outStream = new DataOutputStream(new FileOutputStream(fileName))) {
            for (String str : data.getHeader()) {
                outStream.write((str + separator).getBytes());
            }

            for (int[] d : data.getData()) {
                outStream.write("\n".getBytes());
                for (int number : d) {
                    outStream.write((number + separator).getBytes());
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean loadFromFile(AppData appData, String fileName, String separator) {
        int quantityLine = 0;
        int count = 0;
        List<String[]> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            if (scanner.hasNextLine()) {
                String[] headers = scanner.nextLine().split(separator);
                appData.setHeader(headers);
                count = headers.length;
            }
            while (scanner.hasNextLine()) {
                quantityLine++;
                String[] data = scanner.nextLine().split(separator);
                list.add(data);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
            return false;
        }
        int[][] data = new int[quantityLine][count];
        int line = 0;
        for (String[] str : list) {
            int next = 0;
            for (String s: str) {
                data[line][next] = Integer.parseInt(s);
                next++;
            }
            line++;
        }
        appData.setData(data);
        return true;
    }
}
