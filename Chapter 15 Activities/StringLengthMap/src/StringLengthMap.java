import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 * Modify Worked Example 15.1.
 */
public class StringLengthMap
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename = "Chapter 15 Activities/StringLengthMap/StringLengthMap.java/src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            Map<Integer, String> words = new TreeMap<>();
            

            while (in.hasNext())
            {
                String word = clean(in.next());
                Integer len = word.length();

                String wordList = words.get(len);
                if (wordList ==null)
                {
                    words.put(len,word);
                }
                else {
                    words.put(len,wordList+", "+word);
                }


            }

            for (Integer len: words.keySet()){
                System.out.println(len+":"+words.get(len));
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }

}
