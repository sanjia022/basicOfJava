package day24_31July;

public class AccessSpecifierWithInClass {
	
	public static void add() {}
	private static void subs() {}
	protected static void div() {}
	static void multiplication() {}
	public static void main(String[] args) {
		add();
		subs();
		div();
		multiplication();
	}

}
