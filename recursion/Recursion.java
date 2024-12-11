
/**
 * Write a description of class Recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion
{
    public static double powerOfN(double n, int p)
    {
        if(p > 1)
        {
            
            return (n * powerOfN(n, p - 1));
        }
        else
        {
            return 1;
        }
    }
    
    public static int sum(int n)
    {
        if(n > 1)
        {
            return n + sum(n - 1);
        }
        else
        {
            return 1;
        }
    }
    
    // public static String removeP(String prompt)
    // {
        // int n = prompt.length();
        // String str = "";
        // if (n > 0)
        // {
            // if(prompt.charAt(n) != 'p')
            // {
                // str += prompt.charAt(n);
                // n--;
                // removeP(prompt);
            // }
        // }
        // return str;
    // }
    
    public static String removeP(String input)
    {
        // Base case
        if(input.length() == 0) return "";
        
        if(input.charAt(0) == 'p')
        {
            return removeP(input.substring(1));
        }
        return input.charAt(0) + removeP(input.substring(1));
    }
    
    public static String changePi(String str)
    {
        // Base Case
        if (str.length() < 2)
        {
            return str;
        }
        
        if(str.charAt(0) == 'p' && str.charAt(1) == 'i')
        {
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }
    
    /**
     * Given a string, compute recursively a new string where identical chars
     * that are adjacent in the original string are separated from each other
     * by a "*".
     * 
     * pairStar("hello") → "hel*lo"
     * pairStar("xxyy") → "x*xy*y"
     * pairStar("aaaa") → "a*a*a*a"
     */
    

    public static String pairStar(String str)
    {
        if (str.length() < 2)
        {
            return str;
        }
        else if (str.charAt(0) == str.charAt(1))
        {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }
    
    /**
     * Given a string, reverse the order of the letters in the string.
     * reverseString(“ABCDE”) → “EDCBA”
     * reverseString(“Java”) → “avaJ”
     */
    
    public static String reverseString(String str)
    {
        if (str.length() < 1)
        {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
    
    /**
     * Amazon Interview Question
     *   -- Unique Staircase Combinations
     *   Given a staircase with n number of steps and provided you can only
     *   climb 1 or 2 steps at a time, write a function that returns the number of
     *   unique ways to climb the staircase.
     */
    
    public static int nCombinations(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return nCombinations(n - 1) + nCombinations(n - 2);
    }
    
    public static void ToH(int n, String source, String destination, String intermediate)
    {
        // Base case
        if (n < 1) 
        {
            return;
        }
        ToH(n - 1, source, intermediate, destination);
        System.out.println("Move " + n + " disk from " + source + " to " + destination);
        ToH(n - 1, intermediate, destination, source);
    }
    
    public static void main(String args[])
    {
        System.out.println("Tower of Hanoi with 3 disks:");
        ToH(3, "s", "d", "i");
        System.out.println("----------------------------------------------");
        // PowerOfN
        System.out.println("Power of N with an input of n = 5, and p = 7");
        System.out.println(powerOfN(5, 7));
        System.out.println("----------------------------------------------");
        // Sum
        System.out.println("Sum with an input of 10");
        System.out.println(sum(10));
        System.out.println("----------------------------------------------");
        // removeP
        System.out.println("removeP with an input of \"happy\"");
        System.out.println(removeP("happy"));
        System.out.println("----------------------------------------------");
        // changePi 
        System.out.println("changePi with an input of \"pizza\"");
        System.out.println(changePi("pizza"));
        System.out.println("----------------------------------------------");
        // pairStar
        System.out.println("pairStar with an input of \"hello\"");
        System.out.println(pairStar("hello"));
        System.out.println("----------------------------------------------");
        // reverseString 
        System.out.println("reverseString with an input of \"ABCDE\"");
        System.out.println(reverseString("ABCDE"));
        System.out.println("----------------------------------------------");
        // nCombinations (Fibonacci)
        System.out.println("nCombinations with an input of 7");
        System.out.println(nCombinations(7)); nb                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    z
    }
    
}
