
public class LetterCheck {

    private char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
    private char[] consonantes = { 
        'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n',
        'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z' };
    private char[] numbers = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };

    public LetterCheck() { } // empty constructor

    public boolean VowelCheck(char c) {
        boolean result = false;

        for (char v : vowels) {
            if(v == c)
                result = true;
        }
        return result;
    } // VowelCheck()

    public boolean ConsonantCheck(char ch) {
        boolean result = false;

        for (char c : consonantes) {
            if(c == ch)
                result = true;
        }
        return result;
    } // ConsonantCheck()

    public boolean NumberCheck(char ch) {
        boolean result = false;
        for (char n : numbers) {
            if(n == ch)
                result = true;
        }
        return result;
    } // NumberCheck()

    public int ConvertToUnicode(char c) {
        int code = 0;
        code = (int)c;
        return code;
    }
}