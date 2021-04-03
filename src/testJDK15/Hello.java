package testJDK15;
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello Abhi");
		var x = 10;
		System.out.println("Value of x -" +x);
		
		String str = "This is selenium on Eclipse";
		System.out.println(str.substring(0, 3));
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));
		
	}

}
