package edu.kis.vh.stacks.collections.list;

public class StackList implements StackVector{

	private class Node {
		
		final int value;
		Node prev, next;

		protected Node(int i) {
			value = i;
		}

	}	
	
	private Node last;
	private int i = StackVector.EMPTYSTACK;

	@Override
	public void push(int i) {
		this.i += 1;
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return StackVector.EMPTYSTACK;
		return last.value;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return StackVector.EMPTYSTACK;
		this.i -= 1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	@Override
	public int getTotal() {
		return i;
	}

}

