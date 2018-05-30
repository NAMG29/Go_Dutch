package java_pratice;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class collection_Map {
	
	public static void main(String [] args)
	{
		Map<String,Integer>M1 =new TreeMap<String,Integer>();
		StringBuilder s= new StringBuilder("namna");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		int a=6;
		String s1= Integer.toString(a);
		System.out.println(s1);
		File f1 = new File("C:\\Users\\naman\\Downloads\\naman1.txt");
		if(!f1.exists())
		{
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Created");
		}
		else
		{
			System.out.println("already there");
		}
}
}

class a
{
	public void me()
	{
		
	}
}

class b extends a
{
	public void me()
	{
		
	}
}
