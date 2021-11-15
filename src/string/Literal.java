package string;

public class Literal {
	public static void main(String[] args) {
		String s = new String("java");
		String s1= new String ("maven");
		
		String s2 = new String("java");
		
		int m = System.identityHashCode(s);
		System.out.println(m);
		
		int m1 = System.identityHashCode(s1);
		System.out.println(m1);
		
		int m3 = System.identityHashCode(s2);
		System.out.println(m3);
	}

}
