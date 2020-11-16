package Project2;

import java.util.Arrays;

public class ArrayHeadTailList<T> implements HeadTailListInterface<T> {

	private T[] listArray;
	private int numberOfElements;

	public ArrayHeadTailList(int capacity) {
		T[] tempArr = (T[]) new Object[capacity];
		numberOfElements = 0;
		listArray = tempArr;
	}

	private void expandArray() {
		listArray = Arrays.copyOf(listArray, listArray.length * 2);
	}

	@Override
	public void addFront(T newEntry) {
		if (numberOfElements == listArray.length) {
			this.expandArray();
		}
		for (int i = numberOfElements - 1; i >= 0; i--) {
			listArray[i + 1] = listArray[i];
		}
		listArray[0] = newEntry;
		numberOfElements++;

	}

	@Override
	public void addBack(T newEntry) {
		if (numberOfElements == listArray.length) {
			this.expandArray();
		}
		listArray[numberOfElements] = newEntry;
		numberOfElements++;
	}

	@Override
	public T removeFront() {
		if (numberOfElements != 0) {
			T x = listArray[0];
			for (int i = 0; i < numberOfElements; i++) {
				listArray[i] = listArray[i + 1];
			}
			numberOfElements--;
			return x;
		}
		return null;
	}

	@Override
	public T removeBack() {
		if (numberOfElements != 0) {
			T x = listArray[numberOfElements - 1];
			listArray[numberOfElements - 1] = null;
			numberOfElements--;
			return x;
		}
		return null;
	}

	@Override
	public void clear() {
		for (int i = 0; i < numberOfElements; i++) {
			listArray[i] = null;
		}
		numberOfElements = 0;
	}

	@Override
	public T getEntry(int givenPosition) {
		if (givenPosition >= 0 && givenPosition < listArray.length) {
			return listArray[givenPosition];
		}
		return null;
	}

	@Override
	public void display() {
		System.out.print(numberOfElements + " elements;" + " capacity = " + listArray.length + "\t"+" ");
		for (int i = 0; i < numberOfElements; i++) {
			System.out.print(listArray[i] + "  ");
		}
	}

	@Override
	public int indexOf(T anEntry) {
		for (int i = 0; i < numberOfElements; i++) {
			if (listArray[i].equals(anEntry)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(T anEntry) {
		for (int i = numberOfElements - 1; i > 0; i--) {
			if (listArray[i].equals(anEntry)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean contains(T anEntry) {
		for (int i = 0; i < numberOfElements; i++) {
			if (listArray[i].equals(anEntry)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int size() {
		return numberOfElements;
	}

	@Override
	public boolean isEmpty() {
		if (numberOfElements == 0) {
			return true;
		}
		return false;
	}

}
