package chapter3;

public class Constants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double CM_PER_INCH = 2.54;
		double paperWidth = 8.5;
		double paperHeight=11;
		System.out.println("Paper size is centimeters:"+paperWidth*CM_PER_INCH+"by"+paperHeight*CM_PER_INCH);
		
		int m=7;
		int n=7;
		int a=2*(++m);
		int b=2*(n++);
		System.out.println("m="+m+";n="+n+";a="+a+";b="+b);
		
		double x=9.97;
		int y = (int) x;
		System.out.println(y);
		
		double x1=9.97;
		int y1 = (int) Math.round(x1);
		System.out.println(y1);
		
		String a1="aaaabbbb";
		String b1 = "sjdhf";
		System.out.println(a1.endsWith("bb"));
		System.out.println(b1.substring(3));
		System.out.println(b1.substring(2, 5));
		
		StringBuilder sb= new StringBuilder();
		sb.append("aaa");
		sb.append('c');
		String fullString = sb.toString();
		System.out.println(fullString);
		
		
		
		

	}

}
