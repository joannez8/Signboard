public class Sign {
    private String mes;
    private int width;

    public Sign(String s, int w) {
        mes = s;
        width = w;
    }

    public int numberOfLines() {
        if (mes.length() % width == 0) return mes.length() / width;
        else return mes.length() / width + 1;
    }

    public String getLines() {
        String temp = mes;
        String lines = "";
        for(int i = 1; i < numberOfLines(); i++) {
            lines += temp.substring(0,width) + ";";
            if (temp.length() > width) temp = temp.substring(width);
        }
        lines += temp;
        return lines;
    }
}
