package Exercise_15;

public class Exercise_4
{
    public static void main(String[] args)
    {
        String[] str = new String[5];
        int longest = 0;
        int count = 0;
        
        str[0] = "Saab";
        str[1] = "BMW";
        str[2] = "Volvo";
        str[3] = "Mercedes-Benz";
        str[4] = "Rolls Royce";
        
        String[] results = new String[3];
        
        while (count < 3)
        {
            for (int i = 0; i < str.length - 1; i++)
            {
                if(str[i + 1].length() > str[longest].length())
                {
                    longest = i +1;
                }
            }
            
            results[count] = str[longest];
            str[longest] = "";
            longest = 0;
            count = count + 1;
        }
        System.out.println(results[0]);
        System.out.println(results[1]);
        System.out.println(results[2]);
    }
}
