import java.util.Arrays;

public class MazeAllPathMatrix {
    public static void main(String[] args) {
        boolean board[][] = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        int path[][] = new int[board.length][board[0].length];

        allPath("", board, 0, 0, path, 1);
    }

    static void allPath(String p, boolean maze[][], int r, int c, int path[][], int step) {
        
        if (!maze[r][c]) {
            return;
        }

        path[r][c] = step;
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            for (int arr[] : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            allPath(p + "D", maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {
            allPath(p + "R", maze, r, c + 1, path, step + 1);
        }

        if (r > 0) {
            allPath(p + "U", maze, r - 1, c, path, step + 1);
        }

        if (c > 0) {
            allPath(p + "L", maze, r, c - 1, path, step + 1);
        }

        // this line is where fnc will be over
        // so before fnc gets removed, also remove changes that were made by that fnc
        maze[r][c] = true;
        path[r][c] = 0;

    }
}
