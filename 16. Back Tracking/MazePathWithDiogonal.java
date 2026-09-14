import java.util.ArrayList;

public class MazePathWithDiogonal {
    public static void main(String[] args) {
        System.out.println(path2("", 3, 3));
    }

    static ArrayList<String> path2(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<String>();

        if (row > 1 && col > 1) {
            list.addAll(path2(p + "D", row - 1, col - 1)); // Diagonal
        }

        if (row > 1) {
            list.addAll(path2(p + "V", row - 1, col)); // Vertical
        }

        if (col > 1) {
            list.addAll(path2(p + "H", row, col - 1)); // Horizontal
        }

        return list;

    }
}
