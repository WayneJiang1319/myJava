package chapter3;

import java.util.Scanner;

public class InputAndOutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("what is your name");
		String name = in.nextLine();
		System.out.println("How old are you");
		int age = in.nextInt();
		System.out.println(name+":"+age);

	}

}
