
public class BasicPyramidSample 
{
    private static int pyramidSize = 11;
    public static void main(String[] args)
    {
        for(int i = 0; i < pyramidSize; i++)
        {
            for(int j = pyramidSize - i; j > 1; j--) // prints spaces to the left
            {
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++) // prints chars for pyramid
            {
                System.out.print("$");
            }
            System.out.println(); // blank line
        } // outer for loop - controls layers
    } // class
} // main