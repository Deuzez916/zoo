package Exercise_15;

import java.util.Arrays;

public class Exercise_3
{
    public static void main(String[] args)
    {
        int[] arr = randomize();
        System.out.println(Arrays.toString(arr));
    }
    
    static int[] randomize()
    {
        int[] temp = new int[10];
        for (int i = 0; i < 10; i++)
        {
            temp[i] = (int) Math.round(Math.random() * 100);
        }
        return temp;
    }
}
