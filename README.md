# Project-2
Implement a specific kind of list using an array.

Project Description
You are given an interface for a type of list. The list works like this:
entries can only be added to and removed from the beginning or end of the list
entries can be accessed in any position
entries begin at index 0

Write a class that implements this interface. The class uses arrays to implement the list.
Your class header and instance data variables will be:
  public class ArrayHeadTailList<T> implements HeadTailListInterface<T>
    private T[] listArray;
    private int numberOfElements;
Your class must compile and have the following implemented methods. Follow the API
descriptions from the interface file and the additional characteristics listed below.

- constructor(int)
    take an initial capacity in as a parameter
- addFront(T)
    when the array is full, expand the array by doubling
- addBack(T)
    when the array is full, expand the array by doubling
- removeFront()
- removeBack()
- contains (T)
- indexOf(T)
- lastIndexOf(T)
- getEntry(int)
    review the interface to see what happens with invalid positions
- display()
    see the tester program for the format of the output- your display must match this format!
    the output must contain the size, the capacity, and a display of all elements in the list
- clear()
- isEmpty()
- size()
- Style
    Your class should follow Java coding conventions and best practices.
    Follow naming conventions for variables, classes, and methods.
    Reduce duplicated code.
    Properly format your code.
    Provided Files
Given an interface that you will implement.
Tester file has been provided and it displays the expected output of using your list class.
