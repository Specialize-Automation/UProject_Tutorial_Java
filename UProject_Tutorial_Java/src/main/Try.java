package main;

public class Try {

	public static void main(String[] args) 
	{
		
		String a = "5,669";
		String aditya = "Kumar";
		
	//	String b= (a.substring(0, 1)+a.substring(2,5)).trim();
		String b = a.replaceAll("[,]*", "");
	//	System.out.println(b+10);
		int c = Integer.parseInt(b);
		System.out.println(c+10);
		
		
		
		
		System.out.println(""+aditya+"");
		System.out.println("\""+aditya+"\"");
		
		System.out.println("\"xxxxxx\"");
		
		
		
		
//		Try.compareAllFlightPrice(10);
	}

/*public static String compareAllFlightPrice(int limit)
{
	String id = null;
	for(int j=0;j<limit;j++)
	{
		id = ("o_"+j);
		System.out.println(id);
	}	
	return id;
}*/
	
	/**
import java.util.Scanner; 
Scanner scan = new Scanner(System.in);
String s = scan.next();
int i = scan.nextInt();
sc.close();
BufferedReader and InputStreamReader classes

import java.io.BufferedReader;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
int i = Integer.parseInt(br.readLine());
DataInputStream class

import java.io.DataInputStream;
DataInputStream dis = new DataInputStream(System.in);
int i = dis.readInt();
	 */
}
