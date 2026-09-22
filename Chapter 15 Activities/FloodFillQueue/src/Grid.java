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
        while(!cords.isEmpty()){
            cords.pop();
        }
        int k=1;
        for(int i=0;i<SIZE;i++){
            for (int j=0;j<SIZE;j++){
                pixels[i][j] = k;
                k++;
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
