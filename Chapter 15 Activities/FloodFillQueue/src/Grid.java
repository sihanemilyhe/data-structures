import java.util.Stack;
public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<Pair> cords = new Stack<>();

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        Pair block = new Pair(row, column);
        cords.push(block);
        int fillValue = 1;

        while (!cords.isEmpty())
        {
            Pair current = cords.pop();
            int r = current.getRow();
            int c = current.getColumn();
        

         if (r >= 0 && r < SIZE && c >= 0 && c < SIZE && pixels[r][c] == 0)
            {
                 pixels[r][c] = fillValue;
                fillValue++;
                if (r - 1 >= 0 && r - 1 < SIZE && c >= 0 && c < SIZE && pixels[r - 1][c] == 0)
                {
                    cords.push(new Pair(r - 1, c));
                }
                if (r >= 0 && r < SIZE && c + 1 >= 0 && c + 1 < SIZE && pixels[r][c + 1] == 0)
                {
                    cords.push(new Pair(r, c + 1));
                }
                if (r + 1 >= 0 && r + 1 < SIZE && c >= 0 && c < SIZE && pixels[r + 1][c] == 0)
                {
                    cords.push(new Pair(r + 1, c));
                }
                if (r >= 0 && r < SIZE && c - 1 >= 0 && c - 1 < SIZE && pixels[r][c - 1] == 0)
                {
                    cords.push(new Pair(r, c - 1));
                }
            }
        }

    }

    

    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%3d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
