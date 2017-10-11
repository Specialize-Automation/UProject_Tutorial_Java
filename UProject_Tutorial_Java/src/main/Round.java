package main;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class Round 
{

		public static void main(String args[]) throws IOException
		{

		double a = 123.13698;
		double b =(a*100)/100;
		System.out.println(String.format("%.2f",b));
		
		DecimalFormat newFormat = new DecimalFormat("#.###");
		double B_new =  Double.valueOf(newFormat.format(b));
		System.out.println(B_new);
		
		
		System.out.println("Canonical Name :"+Round.class.getCanonicalName());
		System.out.println("Name :"+Round.class.getName());
		System.out.println("Simple Name:"+Round.class.getSimpleName());
		System.out.println("Type Name:"+Round.class.getTypeName());
		
		File appDir = new File("D:\\aditya\\appfiles"); 
		File app = new File(appDir, "Facebook.apk");
		
//	below will print D:\aditya\appfiles\Facebook.apk
		System.out.println(app.getAbsolutePath());
		System.out.println(app.getCanonicalPath());
		}

}
