package replClass;

public class Value {
	// WRITE YOUR CODE HERE

	int x;

	public Value(int x) {
		System.out.println(getVal());
	}

	public Value() {

	}

	public void setVal(int x) {
		this.x = x;
		wasModified();
		getVal();
	}

	public boolean wasModified() {
		return true;
	}

	public int getVal() {

		return x;

	}

}
