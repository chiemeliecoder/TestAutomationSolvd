package com.laba.solvd.a2.airport;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomLinkedList<T> implements List<T>{

  private Node<T> head;
  private int size;

  public CustomLinkedList() {
    head = null;
    size = 0;
  }

  /**
   * Returns the number of elements in this list.
   * @return the number of elements in this list
   */
  @Override
  public int size() {

    return size;
  }

  /**
   *
   * @return {@code true} if this list contains no elements
   */
  @Override
  public boolean isEmpty() {

    return head == null;
  }

  /**
   * Returns {@code true} if this list contains the specified element. More formally, returns {@code
   * true} if and only if this list contains at least one element {@code e} such that {@code
   * Objects.equals(o, e)}.
   *
   * @param o element whose presence in this list is to be tested
   * @return {@code true} if this list contains the specified element
   * @throws ClassCastException   if the type of the specified element is incompatible with this
   *                              list (<a href="Collection.html#optional-restrictions">optional</a>)
   * @throws NullPointerException if the specified element is null and this list does not permit
   *                              null elements (<a href="Collection.html#optional-restrictions">optional</a>)
   */
  @Override
  public boolean contains(Object o) {
    return false;
  }

  /**
   * Returns an iterator over the elements in this list in proper sequence.
   *
   * @return an iterator over the elements in this list in proper sequence
   */
  @Override
  public Iterator<T> iterator() {
    return null;
  }

  /**
   * Returns an array containing all of the elements in this list in proper sequence (from first to
   * last element).
   *
   * <p>The returned array will be "safe" in that no references to it are
   * maintained by this list.  (In other words, this method must allocate a new array even if this
   * list is backed by an array). The caller is thus free to modify the returned array.
   *
   * <p>This method acts as bridge between array-based and collection-based
   * APIs.
   *
   * @return an array containing all of the elements in this list in proper sequence
   * @see Arrays#asList(Object[])
   */
  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  /**
   * Returns an array containing all of the elements in this list in proper sequence (from first to
   * last element); the runtime type of the returned array is that of the specified array.  If the
   * list fits in the specified array, it is returned therein.  Otherwise, a new array is allocated
   * with the runtime type of the specified array and the size of this list.
   *
   * <p>If the list fits in the specified array with room to spare (i.e.,
   * the array has more elements than the list), the element in the array immediately following the
   * end of the list is set to {@code null}. (This is useful in determining the length of the list
   * <i>only</i> if the caller knows that the list does not contain any null elements.)
   *
   * <p>Like the {@link #toArray()} method, this method acts as bridge between
   * array-based and collection-based APIs.  Further, this method allows precise control over the
   * runtime type of the output array, and may, under certain circumstances, be used to save
   * allocation costs.
   *
   * <p>Suppose {@code x} is a list known to contain only strings.
   * The following code can be used to dump the list into a newly allocated array of {@code
   * String}:
   *
   * <pre>{@code
   *     String[] y = x.toArray(new String[0]);
   * }</pre>
   * <p>
   * Note that {@code toArray(new Object[0])} is identical in function to {@code toArray()}.
   *
   * @param a the array into which the elements of this list are to be stored, if it is big enough;
   *          otherwise, a new array of the same runtime type is allocated for this purpose.
   * @return an array containing the elements of this list
   * @throws ArrayStoreException  if the runtime type of the specified array is not a supertype of
   *                              the runtime type of every element in this list
   * @throws NullPointerException if the specified array is null
   */
  @Override
  public <T1> T1[] toArray(T1[] a) {
    return null;
  }

  /**
   * Appends the specified element to the end of this list (optional operation).
   *
   * <p>Lists that support this operation may place limitations on what
   * elements may be added to this list.  In particular, some lists will refuse to add null
   * elements, and others will impose restrictions on the type of elements that may be added.  List
   * classes should clearly specify in their documentation any restrictions on what elements may be
   * added.
   *
   * @param o element to be appended to this list
   * @return {@code true} (as specified by {@link Collection#add})
   * @throws UnsupportedOperationException if the {@code add} operation is not supported by this
   *                                       list
   * @throws ClassCastException            if the class of the specified element prevents it from
   *                                       being added to this list
   * @throws NullPointerException          if the specified element is null and this list does not
   *                                       permit null elements
   * @throws IllegalArgumentException      if some property of this element prevents it from being
   *                                       added to this list
   */
  @Override
  public boolean add(T o) {
    Node<T> newNode = new Node<>(o);
    if (head == null) {
      head = newNode;
    } else {
      Node<T> t = head;
      while (t.next != null) {
        t = t.next;
      }
      t.next = newNode;
    }
    size++;
    System.out.println(o);
    return true;
  }

  /**
   * Removes the first occurrence of the specified element from this list, if it is present
   * (optional operation).  If this list does not contain the element, it is unchanged.  More
   * formally, removes the element with the lowest index {@code i} such that {@code
   * Objects.equals(o, get(i))} (if such an element exists).  Returns {@code true} if this list
   * contained the specified element (or equivalently, if this list changed as a result of the
   * call).
   *
   * @param o element to be removed from this list, if present
   * @return {@code true} if this list contained the specified element
   * @throws ClassCastException            if the type of the specified element is incompatible with
   *                                       this list (<a href="Collection.html#optional-restrictions">optional</a>)
   * @throws NullPointerException          if the specified element is null and this list does not
   *                                       permit null elements (<a href="Collection.html#optional-restrictions">optional</a>)
   * @throws UnsupportedOperationException if the {@code remove} operation is not supported by this
   *                                       list
   */
  @Override
  public boolean remove(Object o) {
    return false;
  }

  /**
   * Inserts all of the elements in the specified collection into this list at the specified
   * position (optional operation).  Shifts the element currently at that position (if any) and any
   * subsequent elements to the right (increases their indices).  The new elements will appear in
   * this list in the order that they are returned by the specified collection's iterator.  The
   * behavior of this operation is undefined if the specified collection is modified while the
   * operation is in progress.  (Note that this will occur if the specified collection is this list,
   * and it's nonempty.)
   *
   * @param index index at which to insert the first element from the specified collection
   * @param c     collection containing elements to be added to this list
   * @return {@code true} if this list changed as a result of the call
   * @throws UnsupportedOperationException if the {@code addAll} operation is not supported by this
   *                                       list
   * @throws ClassCastException            if the class of an element of the specified collection
   *                                       prevents it from being added to this list
   * @throws NullPointerException          if the specified collection contains one or more null
   *                                       elements and this list does not permit null elements, or
   *                                       if the specified collection is null
   * @throws IllegalArgumentException      if some property of an element of the specified
   *                                       collection prevents it from being added to this list
   * @throws IndexOutOfBoundsException     if the index is out of range ({@code index < 0 || index >
   *                                       size()})
   */
  @Override
  public boolean addAll(int index, Collection<? extends T> c) {

    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    if (c.isEmpty()) {
      return false;
    }

    int i = 0;
    Node<T> currentNode = head;
    Node<T> prevNode = null;

    // Find the node at the specified index
    while (i < index) {
      prevNode = currentNode;
      currentNode = currentNode.next;
      i++;
    }

    // Create and link the new nodes for the collection elements
    for (T element : c) {
      Node<T> newNode = new Node<>(element);
      if (prevNode == null) {
        // Insert at the beginning of the list
        newNode.next = head;
        head = newNode;
      } else {
        // Insert in the middle or at the end of the list
        newNode.next = currentNode;
        prevNode.next = newNode;
      }
      prevNode = newNode;
      size++;
    }

    return true;
  }

  /**
   * Removes all of the elements from this list (optional operation). The list will be empty after
   * this call returns.
   *
   * @throws UnsupportedOperationException if the {@code clear} operation is not supported by this
   *                                       list
   */
  @Override
  public void clear() {
    head = null;
    size = 0;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index index of the element to return
   * @return the element at the specified position in this list
   * @throws IndexOutOfBoundsException if the index is out of range ({@code index < 0 || index >=
   *                                   size()})
   */
  @Override
  public T get(int index) {

    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }

    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }

    return (T)temp.data;
  }

  /**
   * Replaces the element at the specified position in this list with the specified element
   * (optional operation).
   *
   * @param index   index of the element to replace
   * @param element element to be stored at the specified position
   * @return the element previously at the specified position
   * @throws UnsupportedOperationException if the {@code set} operation is not supported by this
   *                                       list
   * @throws ClassCastException            if the class of the specified element prevents it from
   *                                       being added to this list
   * @throws NullPointerException          if the specified element is null and this list does not
   *                                       permit null elements
   * @throws IllegalArgumentException      if some property of the specified element prevents it
   *                                       from being added to this list
   * @throws IndexOutOfBoundsException     if the index is out of range ({@code index < 0 || index
   *                                       >= size()})
   */
  @Override
  public T set(int index, T element) {

    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    Node<T> currentNode = head;
    for (int i = 0; i < index; i++) {
      currentNode = currentNode.next;
    }

    T oldValue = currentNode.data;
    currentNode.data = element;
    return oldValue;
  }

  /**
   * Inserts the specified element at the specified position in this list (optional operation).
   * Shifts the element currently at that position (if any) and any subsequent elements to the right
   * (adds one to their indices).
   *
   * @param index   index at which the specified element is to be inserted
   * @param element element to be inserted
   * @throws UnsupportedOperationException if the {@code add} operation is not supported by this
   *                                       list
   * @throws ClassCastException            if the class of the specified element prevents it from
   *                                       being added to this list
   * @throws NullPointerException          if the specified element is null and this list does not
   *                                       permit null elements
   * @throws IllegalArgumentException      if some property of the specified element prevents it
   *                                       from being added to this list
   * @throws IndexOutOfBoundsException     if the index is out of range ({@code index < 0 || index >
   *                                       size()})
   */
  @Override
  public void add(int index, T element) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    if (index == 0) {
      Node<T> newNode = new Node<>(element);
      newNode.next = head;
      head = newNode;
    } else {
      Node<T> currentNode = head;
      for (int i = 0; i < index - 1; i++) {
        currentNode = currentNode.next;
      }
      Node<T> newNode = new Node<>(element);
      newNode.next = currentNode.next;
      currentNode.next = newNode;
    }

    size++;

  }

  /**
   * Removes the element at the specified position in this list (optional operation).  Shifts any
   * subsequent elements to the left (subtracts one from their indices).  Returns the element that
   * was removed from the list.
   *
   * @param index the index of the element to be removed
   * @return the element previously at the specified position
   * @throws UnsupportedOperationException if the {@code remove} operation is not supported by this
   *                                       list
   * @throws IndexOutOfBoundsException     if the index is out of range ({@code index < 0 || index
   *                                       >= size()})
   */
  @Override
  public T remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    T removedValue;
    if (index == 0) {
      removedValue = head.data;
      head = head.next;
    } else {
      Node<T> currentNode = head;
      for (int i = 0; i < index - 1; i++) {
        currentNode = currentNode.next;
      }
      removedValue = currentNode.data;
      currentNode.next = currentNode.next.next;
    }

    size--;
    return removedValue;
  }

  /**
   * Removes from this list all of its elements that are contained in the specified collection
   * (optional operation).
   *
   * @param c collection containing elements to be removed from this list
   * @return {@code true} if this list changed as a result of the call
   * @throws UnsupportedOperationException if the {@code removeAll} operation is not supported by
   *                                       this list
   * @throws ClassCastException            if the class of an element of this list is incompatible
   *                                       with the specified collection (<a href="Collection.html#optional-restrictions">optional</a>)
   * @throws NullPointerException          if this list contains a null element and the specified
   *                                       collection does not permit null elements (<a
   *                                       href="Collection.html#optional-restrictions">optional</a>),
   *                                       or if the specified collection is null
   * @see #remove(Object)
   * @see #contains(Object)
   */
  @Override
  public boolean removeAll(Collection<?> c) {

    boolean modified = false;
    Node<T> currentNode = head;
    Node<T> prevNode = null;

    while (currentNode != null) {
      if (c.contains(currentNode.data)) {
        if (prevNode == null) {
          // Removing the head node
          head = currentNode.next;
        } else {
          // Removing a node in the middle or at the end
          prevNode.next = currentNode.next;
        }
        size--;
        modified = true;
      } else {
        prevNode = currentNode;
      }
      currentNode = currentNode.next; //currentNode.next.data might change Node
    }

    return modified;
  }

  /**
   * Retains only the elements in this list that are contained in the specified collection (optional
   * operation).  In other words, removes from this list all of its elements that are not contained
   * in the specified collection.
   *
   * @param c collection containing elements to be retained in this list
   * @return {@code true} if this list changed as a result of the call
   * @throws UnsupportedOperationException if the {@code retainAll} operation is not supported by
   *                                       this list
   * @throws ClassCastException            if the class of an element of this list is incompatible
   *                                       with the specified collection (<a href="Collection.html#optional-restrictions">optional</a>)
   * @throws NullPointerException          if this list contains a null element and the specified
   *                                       collection does not permit null elements (<a
   *                                       href="Collection.html#optional-restrictions">optional</a>),
   *                                       or if the specified collection is null
   * @see #remove(Object)
   * @see #contains(Object)
   */
  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  /**
   * Returns {@code true} if this list contains all of the elements of the specified collection.
   *
   * @param c collection to be checked for containment in this list
   * @return {@code true} if this list contains all of the elements of the specified collection
   * @throws ClassCastException   if the types of one or more elements in the specified collection
   *                              are incompatible with this list (<a href="Collection.html#optional-restrictions">optional</a>)
   * @throws NullPointerException if the specified collection contains one or more null elements and
   *                              this list does not permit null elements (<a href="Collection.html#optional-restrictions">optional</a>),
   *                              or if the specified collection is null
   * @see #contains(Object)
   */
  @Override
  public boolean containsAll(Collection<?> c) {

    for (Object element : c) {
      if (!contains(element)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Returns the index of the first occurrence of the specified element in this list, or -1 if this
   * list does not contain the element. More formally, returns the lowest index {@code i} such that
   * {@code Objects.equals(o, get(i))}, or -1 if there is no such index.
   *
   * @param o element to search for
   * @return the index of the first occurrence of the specified element in this list, or -1 if this
   * list does not contain the element
   * @throws ClassCastException   if the type of the specified element is incompatible with this
   *                              list (<a href="Collection.html#optional-restrictions">optional</a>)
   * @throws NullPointerException if the specified element is null and this list does not permit
   *                              null elements (<a href="Collection.html#optional-restrictions">optional</a>)
   */
  @Override
  public int indexOf(Object o) {

    Node<T> currentNode = head;
    int index = 0;

    while (currentNode != null) {
      if (o == null ? currentNode.data == null : o.equals(currentNode.data)) {
        return index;
      }
      currentNode = currentNode.next;
      index++;
    }

    return -1; // Element not found
  }

  /**
   * Returns the index of the last occurrence of the specified element in this list, or -1 if this
   * list does not contain the element. More formally, returns the highest index {@code i} such that
   * {@code Objects.equals(o, get(i))}, or -1 if there is no such index.
   *
   * @param o element to search for
   * @return the index of the last occurrence of the specified element in this list, or -1 if this
   * list does not contain the element
   * @throws ClassCastException   if the type of the specified element is incompatible with this
   *                              list (<a href="Collection.html#optional-restrictions">optional</a>)
   * @throws NullPointerException if the specified element is null and this list does not permit
   *                              null elements (<a href="Collection.html#optional-restrictions">optional</a>)
   */
  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  /**
   * Returns a list iterator over the elements in this list (in proper sequence).
   *
   * @return a list iterator over the elements in this list (in proper sequence)
   */
  @Override
  public ListIterator<T> listIterator() {
    return null;
  }

  /**
   * Returns a list iterator over the elements in this list (in proper sequence), starting at the
   * specified position in the list. The specified index indicates the first element that would be
   * returned by an initial call to {@link ListIterator#next next}. An initial call to {@link
   * ListIterator#previous previous} would return the element with the specified index minus one.
   *
   * @param index index of the first element to be returned from the list iterator (by a call to
   *              {@link ListIterator#next next})
   * @return a list iterator over the elements in this list (in proper sequence), starting at the
   * specified position in the list
   * @throws IndexOutOfBoundsException if the index is out of range ({@code index < 0 || index >
   *                                   size()})
   */
  @Override
  public ListIterator<T> listIterator(int index) {
    return null;
  }

  /**
   * Returns a view of the portion of this list between the specified {@code fromIndex}, inclusive,
   * and {@code toIndex}, exclusive.  (If {@code fromIndex} and {@code toIndex} are equal, the
   * returned list is empty.)  The returned list is backed by this list, so non-structural changes
   * in the returned list are reflected in this list, and vice-versa. The returned list supports all
   * of the optional list operations supported by this list.<p>
   * <p>
   * This method eliminates the need for explicit range operations (of the sort that commonly exist
   * for arrays).  Any operation that expects a list can be used as a range operation by passing a
   * subList view instead of a whole list.  For example, the following idiom removes a range of
   * elements from a list:
   * <pre>{@code
   *      list.subList(from, to).clear();
   * }</pre>
   * Similar idioms may be constructed for {@code indexOf} and {@code lastIndexOf}, and all of the
   * algorithms in the {@code Collections} class can be applied to a subList.<p>
   * <p>
   * The semantics of the list returned by this method become undefined if the backing list (i.e.,
   * this list) is <i>structurally modified</i> in any way other than via the returned list.
   * (Structural modifications are those that change the size of this list, or otherwise perturb it
   * in such a fashion that iterations in progress may yield incorrect results.)
   *
   * @param fromIndex low endpoint (inclusive) of the subList
   * @param toIndex   high endpoint (exclusive) of the subList
   * @return a view of the specified range within this list
   * @throws IndexOutOfBoundsException for an illegal endpoint index value ({@code fromIndex < 0 ||
   *                                   toIndex > size || fromIndex > toIndex})
   */
  @Override
  public List<T> subList(int fromIndex, int toIndex) {
    return null;
  }


  /**
   * Returns a hash code value for the object. This method is supported for the benefit of hash
   * tables such as those provided by {@link HashMap}.
   * <p>
   * The general contract of {@code hashCode} is:
   * <ul>
   * <li>Whenever it is invoked on the same object more than once during
   *     an execution of a Java application, the {@code hashCode} method
   *     must consistently return the same integer, provided no information
   *     used in {@code equals} comparisons on the object is modified.
   *     This integer need not remain consistent from one execution of an
   *     application to another execution of the same application.
   * <li>If two objects are equal according to the {@code equals(Object)}
   *     method, then calling the {@code hashCode} method on each of
   *     the two objects must produce the same integer result.
   * <li>It is <em>not</em> required that if two objects are unequal
   *     according to the {@link Object#equals(Object)}
   *     method, then calling the {@code hashCode} method on each of the
   *     two objects must produce distinct integer results.  However, the
   *     programmer should be aware that producing distinct integer results
   *     for unequal objects may improve the performance of hash tables.
   * </ul>
   * <p>
   * As much as is reasonably practical, the hashCode method defined
   * by class {@code Object} does return distinct integers for
   * distinct objects. (The hashCode may or may not be implemented
   * as some function of an object's memory address at some point
   * in time.)
   *
   * @return a hash code value for this object.
   * @see Object#equals(Object)
   * @see System#identityHashCode
   */
  @Override
  public int hashCode() {

    int result = 1;
    Node<T> currentNode = head;
    while (currentNode != null) {
      result = 31 * result + (currentNode.data != null ? currentNode.data.hashCode() : 0);
      currentNode = currentNode.next;
    }
    return result;
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   * <p>
   * The {@code equals} method implements an equivalence relation on non-null object references:
   * <ul>
   * <li>It is <i>reflexive</i>: for any non-null reference value
   *     {@code x}, {@code x.equals(x)} should return
   *     {@code true}.
   * <li>It is <i>symmetric</i>: for any non-null reference values
   *     {@code x} and {@code y}, {@code x.equals(y)}
   *     should return {@code true} if and only if
   *     {@code y.equals(x)} returns {@code true}.
   * <li>It is <i>transitive</i>: for any non-null reference values
   *     {@code x}, {@code y}, and {@code z}, if
   *     {@code x.equals(y)} returns {@code true} and
   *     {@code y.equals(z)} returns {@code true}, then
   *     {@code x.equals(z)} should return {@code true}.
   * <li>It is <i>consistent</i>: for any non-null reference values
   *     {@code x} and {@code y}, multiple invocations of
   *     {@code x.equals(y)} consistently return {@code true}
   *     or consistently return {@code false}, provided no
   *     information used in {@code equals} comparisons on the
   *     objects is modified.
   * <li>For any non-null reference value {@code x},
   *     {@code x.equals(null)} should return {@code false}.
   * </ul>
   * <p>
   * The {@code equals} method for class {@code Object} implements
   * the most discriminating possible equivalence relation on objects;
   * that is, for any non-null reference values {@code x} and
   * {@code y}, this method returns {@code true} if and only
   * if {@code x} and {@code y} refer to the same object
   * ({@code x == y} has the value {@code true}).
   * <p>
   * Note that it is generally necessary to override the {@code hashCode}
   * method whenever this method is overridden, so as to maintain the
   * general contract for the {@code hashCode} method, which states
   * that equal objects must have equal hash codes.
   *
   * @param obj the reference object with which to compare.
   * @return {@code true} if this object is the same as the obj argument; {@code false} otherwise.
   * @see #hashCode()
   * @see HashMap
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    CustomLinkedList<?> otherList = (CustomLinkedList<?>) obj;
    if (size != otherList.size()) {
      return false;
    }
    Node<T> currentNode = head;
    Node<?> otherNode = otherList.head;
    while (currentNode != null) {
      if (currentNode.data != null ? !currentNode.data.equals(otherNode.data) : otherNode.data != null) {
        return false;
      }
      currentNode = currentNode.next;
      otherNode = otherNode.next;
    }
    return true;
  }

  /**
   * Appends all of the elements in the specified collection to the end of this list, in the order
   * that they are returned by the specified collection's iterator (optional operation).  The
   * behavior of this operation is undefined if the specified collection is modified while the
   * operation is in progress.  (Note that this will occur if the specified collection is this list,
   * and it's nonempty.)
   *
   * @param c collection containing elements to be added to this list
   * @return {@code true} if this list changed as a result of the call
   * @throws UnsupportedOperationException if the {@code addAll} operation is not supported by this
   *                                       list
   * @throws ClassCastException            if the class of an element of the specified collection
   *                                       prevents it from being added to this list
   * @throws NullPointerException          if the specified collection contains one or more null
   *                                       elements and this list does not permit null elements, or
   *                                       if the specified collection is null
   * @throws IllegalArgumentException      if some property of an element of the specified
   *                                       collection prevents it from being added to this list
   * @see #add(Object)
   */
  @Override
  public boolean addAll(Collection<? extends T>  c) {

    boolean modified = false;
    for (T element : c) {
      if (add(element)) {
        modified = true;
      }
    }
    return modified;
  }
}
