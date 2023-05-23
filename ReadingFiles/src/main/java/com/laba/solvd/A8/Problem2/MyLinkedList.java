package com.laba.solvd.A8.Problem2;

public class MyLinkedList<T> implements ILinkedList {
  private Node head;
  private int size;

  public MyLinkedList() {
    head = null;
    size = 0;
  }

  public void add(Object data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
    size++;
    System.out.println(data);
  }

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

  public int size() {
    System.out.println(size);
    return size;
  }

}
