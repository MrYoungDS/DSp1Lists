/**
 * The MyArrayList class is the implementation of an array list of integers.
 * <p>
 * The data in the list will be stored in an array, and the basic
 * <code>ArrayList</code> methods <code>add</code>, <code>remove</code>,
 * <code>set</code>, <code>get</code>, and <code>size</code> will be
 * implemented, as well as the additional methods <code>indexOf</code>,
 * <code>contains</code>, <code>clear</code>, and <code>isEmpty</code>.
 * <p>
 * Students should not, obviously, use the <code>java.util.ArrayList</code>
 * Java library class. The choices that you make regarding the management
 * of the list array will influence how the methods are implemented. You
 * may add any additional instance fields as desired. The choice that has
 * been made for you is that the default constructor should give an initial
 * capacity of ten elements. Be sure to manage the
 * <code>IndexOutOfBoundsException</code>, as specified further in the JUnit
 * <code>MyArrayListTest</code> class.
 */
public class MyArrayList
{
    private Integer[] list;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public MyArrayList() {
        list = new Integer[10];
        // TODO your code here
    }

    /**
     * Appends the specified Integer to the <b>end</b> of the list.
     * @param value Integer to be appended to this list
     */
    public void addLast(Integer value) {
        // TODO your code here
    }

    /**
     * Inserts the specified Integer at the specified position in this list.
     * Shifts the element currently in that position (if any) and any subsequent
     * elements to the right (adding one to their indices).
     * @param index index at which the specified element is to be inserted
     * @param value Integer to be inserted
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public void add(int index, Integer value) {
        // TODO your code here
    }

    /**
     * Removes the Integer at the specified position in this list. Shifts any
     * subsequent Integers to the left (subtracts one from their indices).
     * @param index the index of the element to remove
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public Integer remove(int index) {
        // TODO replace the code here
        return 0;
    }

    /**
     * Returns the Integer at the specified position in this list.
     * @param index index of the element to return
     * @return the Integer at the specified position in this list
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public Integer get(int index) {
        // TODO replace the code here
        return 0;
    }

    /**
     * Replaces the Integer at the specified position in this list with the
     * specified Integer.
     * @param index index of the integer to replace
     * @param value Integer to be stored at the specified position
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public void set(int index, Integer value) {
        // TODO your code here
    }

    /**
     * Returns the number of Integers in this list.
     * @return the number of Integers in this list
     */
    public int size() {
        // TODO replace the code here
        return 0;
    }

    /**
     * Returns the index of the first occurrence of the specified Integer
     * in this list, or -1 if this list does not contain the Integer.
     * @param value Integer to search for
     * @return the index of the first occurrence of the specified Integer
     * in this list, or -1 if this list does not contain the Integer
     */
    public int indexOf(Integer value) {
        // TODO replace the code here
        return 0;
    }

    /**
     * Returns <code>true</code> if this list contains the specified Integer.
     * @param value Integer whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    public boolean contains(Integer value) {
        // TODO replace the code here
        return false;
    }

    /**
     * Removes all the elements from this list.
     * @post the capacity of the array should not change
     */
    public void clear() {
        // TODO your code here
    }

    /**
     * Returns <code>true</code> if this list has no elements.
     * @return true if this list is empty
     */
    public boolean isEmpty() {
        // TODO replace the code here
        return false;
    }
}
