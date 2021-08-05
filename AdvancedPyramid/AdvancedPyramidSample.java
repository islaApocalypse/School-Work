
public class AdvancedPyramidSample {

    // solution to the print a pyramid question from Chap 5
    /*
        * please note - this is quite the challenge!
        - my solution is still not perfect!
    */
    public static void main(String[] args) {
        int start = 8;
        int end = 8;
        int num = 1;

        for(int row = 8; row > 0; row--) { // rows
            for(int col = 1; col <= 15; col++) { // cols
                // checks print range
                if(col >= start && col <= end) {
                    if(num < 10)
                        System.out.print(" " + num + " ");
                    else if(num >= 10 && num < 100)
                        System.out.print(num + " ");
                    else 
                        System.out.print(num);
                    if(col < 8)
                        num *= 2;
                    else 
                        num /= 2;
                } 
                else { // out of range, print blank
                    System.out.print("   ");
                }
            } // cols
            // tracks how far from center to print num
            start--; // 7, 6, 5 etc...
            end++; // 9, 10, 11 etc...
            num = 1; // reset num for next row
            System.out.println(); // just a carriage return Bob
        } // rows
    } // main
} // class