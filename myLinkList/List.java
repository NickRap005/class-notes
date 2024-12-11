
/**
 * Write a description of class List here.
 *
 * @author (Nicholas Rapacciuolo)
 * @version (1.0)
 */
public interface List<E>
{
    public boolean add (E elemnt);
    public boolean add (int index, E element);
    public boolean remove(int index);
    public boolean contains(E element);
    public E get (int index);
    public boolean set (int index, E element);
}
