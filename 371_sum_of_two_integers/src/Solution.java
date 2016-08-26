/**
 * Created by tim on 8/25/16.
 */
public class Solution
{
    public static void main(String[] args)
    {
        int result = canWinNim(10, 22);
        System.out.println(result);
    }


    public static int canWinNim(int a, int b)
    {
        int sum = 0;

        while (b != 0)
        {
            int carry = (a & b) ;

            sum = a ^ b;

            b = carry << 1;
        }

        return sum;

    }
}
