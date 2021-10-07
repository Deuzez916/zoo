package Exercise_14;

public class Exercise_1
{
    public static void main(String[] args)
    {
        // a
        String mySentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(mySentence);
        
        int stringlength = mySentence.length();
        System.out.println("string length: " + stringlength);
        
        int stringlengthwithoutspaces = mySentence.replace(" ", "").length();
        System.out.println("string length without counting "
                + "whitespaces: " + stringlengthwithoutspaces);
        // b
        System.out.println("string char 10: " + mySentence.charAt(10 + 1));
        // c
        System.out.println("string last char: " + mySentence.charAt
        (mySentence.length()-1));
        // d
        System.out.println(mySentence.toLowerCase());
    }
}