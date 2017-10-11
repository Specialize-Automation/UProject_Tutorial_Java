package main;

public class StringCheck {

	public static void main(String[] args) 
	{
			StringBuilder sb=new StringBuilder("ABCDE"); 
			System.out.println(sb.length());
			sb.delete(0,3); 
			System.out.println(sb.length());
			System.out.println(sb+"  "+sb.length());
	}

}
