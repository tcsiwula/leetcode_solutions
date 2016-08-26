public class Solution
{
    public static void main(String[] args)
    {
        boolean test = canWinNim(100);
        System.out.println(test);
    }


    public static boolean canWinNim(int n)
    {
        boolean canWin = false;

        if ( n % 1 == 0 || n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 6 == 0 || n % 7 == 0)
        {
            canWin = true;
        }
        else if ( n % 4 == 0 || n % 8 == 0)
        {
            canWin = false;
        }

        return canWin;
    }
}