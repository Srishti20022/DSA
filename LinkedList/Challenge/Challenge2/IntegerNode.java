package Challenge2;


public class IntegerNode {
	
	IntegerNode next ;
	Integer integer ;
	
	IntegerNode(Integer integer) {
		 this.integer = integer ;
	}
	public int getInt() {
		return integer.getInteger();
	}

	public IntegerNode getNext() {
		return next;
	}

	public void setNext(IntegerNode next) {
		this.next = next;
	}

	public Integer getInteger() {
		return integer;
	}
	public String toString() {
		return integer.toString();
	}
	

}
