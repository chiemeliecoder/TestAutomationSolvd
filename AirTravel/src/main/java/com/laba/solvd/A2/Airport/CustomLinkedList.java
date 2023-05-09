package com.laba.solvd.A2.Airport;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public abstract class CustomLinkedList<T> implements List {


  /**
   * Returns the number of elements in this list.  If this list contains more than {@code
   * Integer.MAX_VALUE} elements, returns {@code Integer.MAX_VALUE}.
   *
   * @return the number of elements in this list
   */
  @Override
  public int size() {
    return 0;
  }

  /**
   * Returns {@code true} if this list contains no elements.
   *
   * @return {@code true} if this list contains no elements
   */
  @Override
  public boolean isEmpty() {
    return false;
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
  public boolean add(Object o) {
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
  public boolean addAll(int index, Collection c) {
    return false;
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
  public Object get(int index) {
    return null;
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
  public Object set(int index, Object element) {
    return null;
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
  public void add(int index, Object element) {

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
  public Object remove(int index) {
    return null;
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
  public boolean removeAll(Collection c) {
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
  public boolean containsAll(Collection c) {
    return false;
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
    return 0;
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
    return super.hashCode();
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
    return super.equals(obj);
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
  public boolean addAll(Collection c) {
    return false;
  }
}
