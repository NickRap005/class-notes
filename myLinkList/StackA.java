
/**
 * This is a variation on the Stack class that accomplishes all the same methods using an ArrayList instead of a LinkedList
 *
 * @author (Nicholas Rapacciuolo)
 * @version (11/7/24)
 */
public class StackA<E> extends ArrayList<E>
{
    
    /**
     * @param: N/A
     * 
     * @post: returns the boolean value of the equation the return statement
     */
    
    public boolean empty()
    {
        return size() == 0;
    }
    
    /**
     * @param: N/A
     * 
     * @post: peeks at the value at the top of the stack, which in this case would be the last element in the array.
     * According to the "First In, Last Out" template stacks use.
     */
    
    public E peek()
    {
        if (!empty())
        {
            return get(size() - 1);
        }
        return null;
    }
    
    /**
     * @param: N/A
     * 
     * @post: removes the last element of the array
     */
    
    public E pop()
    {
        if (!empty())
        {
            E element = get(size() - 1);
            remove(size() - 1);
            return element;
        }
        return null;
    }
    
    /**
     * @param: the data of value being added to the stack
     * 
     * @post: adds the element to the end of the stack
     */
    
    public E push(E data)
    {
        add(data);
        return data;
    }
    
    /**
     * @param: key that the method searches for
     * 
     * @post: iterates through the stack and stopping if the key is found, else null is returned
     */
    
    public E search(Object obj)
    {
        // use search method from arraylist class
        for (int i = 0; i < size(); i++)
        {
            if (get(i).equals(obj))
            {
                return get(i);
            }
        }
        // Not found
        return null;
    }
    
    // Making some test cases...
    public static void main(String args[])
    {
        StackA<Integer> stack = new StackA<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.toString());
        System.out.println("Peeking top of stack, expected 5: actual, " + stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println("Peeking top stack aftet two pops, expected 3: actual, " + stack.peek());
        int result = stack.search(2);
        System.out.println("Search stack for 2, expected 2: actual, " + result);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Testing empty() method, expected true: actual, " + stack.empty());
        System.out.println("Peeking empty stack, expected: null, actual: : " + stack.peek());
        System.out.println(stack);
    }
    
}
