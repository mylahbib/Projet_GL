package Adapter;

public class Adapter extends ImplAdaptee implements Stantard {

	@Override
	public void operation(int n1, int n2) {
		// TODO Auto-generated method stub

		int res = operation2(n1, n2);
		operation3(res);
	}

}
