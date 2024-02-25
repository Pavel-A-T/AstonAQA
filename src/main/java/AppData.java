public class AppData {
    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    @Override
    public String toString() {
        String separator = "; ";
        String result = "";
        result += "headers -> ";
        for (int i = 0; i < header.length; i++) {
            result += header[i] + separator;
        }
        result += "\n data ->";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result += data[i][j] + separator;
            }
            result += "\n";
        }
        return result;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
}
