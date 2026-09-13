import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        path("", 3,3);
        System.out.println(path2("", 3, 3));
    }

    static void path(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if(row>1){
            path(p+"D", row - 1, col);
        }

        if(col > 1){
            path(p + "R", row, col - 1);
        }

    }

    static ArrayList<String> path2(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> list = new ArrayList<String>();

        if(row>1){
            list.addAll(path2(p+"D", row - 1, col));
        }

        if(col > 1){
            list.addAll(path2(p + "R", row, col - 1));
        }

        return list;

    }
}
