
/**
 * ArrayList data structure that uses an array plus accessor and mutator methods for a greater degree of control.
 *
 * @author (Nicholas Rapacciuolo)
 * @version (11/7/24)
 */
public class ArrayList<E> implements List<E>
{
    protected Object [] arr;
    protected int size;
    public static final int DEFAULT = 10;
    
    /**
     * Constructor
     * Initialize instance varaiable, arr
     */
    public ArrayList() 
    {
        arr = new Object[DEFAULT];
        size = 0;
    }
    
    public boolean add (int index, E val)
    {
        //boundry check
        if (index < 0 || index > size)
        {
            return false;
        }
        //capacity check
        if (size == arr.length)
        {
            return false;
        }
        for (int i = size - 1; i >= index; ++i)
        {
            arr[i + 1] = arr[i];
        }
        arr[index] = val;
        size++;
        return true;
    }
    
    public boolean add(E val)
    {
        return add(size, val);
    }
    
    public boolean remove (int index)
    {
        if (index < 0 || index >= size)
        {
            return false;
        }
        for (int i = index; i < size; i++)
        {
            arr[i] = arr[i + 1];
        }
        size--;
        return true;
    }
    
    public boolean contains(E value) 
    {
        for (int i = 0; i < size; i++)
        {
            Object item = arr[i];
            if(item != null && ((E)item).equals(value))
            {
                return true;
            }
        }
        return false;
    }
    
    public String toString()
    {
        String out = "[";
        for(int i = 0; i < size; i++)
        {
           out += arr[i];
           if (i < size - 1)
            {
                out += ", ";
            }
        }
        out += "]";
        return out;
    }
    
    public E get (int index)
    {
        if (index >= 0 && index <= size - 1)
        {
            return (E)arr[index];
        }
        else return null;
    }

    public boolean set (int index, E value)
    {
        if (index < arr.length)
        {
            arr[index] = value;
            return true;
        }
        return false;
    }
    
    public int size()
    {
        return size;
    }
    
    
    public static void main (String args[])
    {
        ArrayList<String> str = new ArrayList<String>();
        str.add("Java");
        str.add(1, "is");
        str.add("not");
        str.add("so");
        str.add("much");
        str.add("fun");
        System.out.println(str);
        str.remove(2);
        System.out.println(str);
        System.out.println("Contains not?" + str.contains("not"));
        
    }
}
