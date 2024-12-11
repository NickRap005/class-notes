
/**
 * DriverStack is intended to test the capabilities of a Stack by creating various test methods and cases
 *
 * @author (Nicholas Rapacciuolo)
 * @version (11/7/24)
 */
public class DriverStack
{
   public static String reverse(Stack<String> stack, String str)
   {
       for (int i = 0; i < str.length(); i++)
       {
           stack.push("" + str.charAt(i));
       }
       String out = "";
       while (!stack.empty())
       {
           out += stack.pop();
       }
       return out;
   }
   
   // Recursively
   public static void sort(Stack<Integer> stack, Integer[] arr)
   {
       for (int i = 0; i < arr.length; i++)
       {
           sort(stack, arr[i]);
       }
   }
   
   // Recursive method
   public static void sort(Stack<Integer> stack, Integer i)
   {
       // Base case
       if (stack.empty())
       {
           stack.push(i);
           return;
       }
        Integer top = stack.pop();
        if (top < i)
        {
            // Recursive
            sort(stack, i);
            stack.push(top);
        }
        else
        {
            // 2nd Base case
            stack.push(top);
            stack.push(i);
        }
   }
   
   public static void main(String[] args)
   {
       Stack<String> s1 = new Stack<String>();
       String str = "ABCD";
       String rStr = reverse(s1, str);
       System.out.println("str: " + str);
       System.out.println("reversed str: " + rStr);
       
       Stack<Integer> s2 = new Stack<Integer>();
       Integer[] arr = {10, 21, 1, 3, 2, 11};
       System.out.print("arr: [");
       for (int i = 0; i < arr.length; i++)
       {
           if (i < arr.length - 1)
           {
               System.out.print(arr[i] + ", ");
           }
           else
           {
                System.out.print(arr[i]);              
           }
       }
       System.out.println("]");
       sort(s2, arr);
       System.out.println("sorted arr: " + s2);
   }
}
