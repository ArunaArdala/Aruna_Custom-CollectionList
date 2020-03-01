package com.DataStructures.Collections;
import java.util.*;
import java.util.Scanner;
public class Custom_CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj = new LinkedList<String>();
		String data;
		Scanner sc =  new Scanner(System.in);
		int ch,ch1,pos;
		
		
		obj.add("Git");
		obj.add("Github");
		obj.add("Maven");
		obj.add("Oops");
		obj.add("Layered Architecture");
		obj.add("Clean Code");
		obj.add("I/O serialization");
		obj.add("Exceptional handling");
		obj.add("Loggers");
		obj.add("Collections");
		//System.out.println(obj);
		try {
			while(true)
			{
				System.out.println("1.Insertion\n2.Deletion\n3.Display\n4.Searching\n5.exit");
				System.out.print("Which operation do you want to perform? : ");
				ch = sc.nextInt();
				switch(ch)
				{
				case 1: System.out.println("1.AddFirst\n2.AddLast\n3.Add");
						ch1 = sc.nextInt();
						System.out.print("Enter the data : ");
						data = sc.next();
						if(ch1 == 1)
							obj.addFirst(data);
						else if(ch1 == 2)
							obj.addLast(data);
						else if(ch1 == 3) {
							System.out.print("Enter its position : ");
							pos = sc.nextInt();
							obj.add(pos,data);
						}
						else
							System.out.println("OOPS!... you entered wrong option");
						break;
				case 2: System.out.println("1.removeFirst\n2.removeLast\n3.remove");
						ch1 = sc.nextInt();
						if(ch1 == 1)
							obj.removeFirst();
						else if(ch1 == 2)
							obj.removeLast();
						else if(ch1 == 3) {
							System.out.print("Enter position : ");
							pos = sc.nextInt();
							obj.remove(pos);
						}
						else
							System.out.println("OOPS!... you entered wrong option");
						break;
				case 3:System.out.println("The concepts that are discussed at epam are : ");
						for(String s: obj)
						{
							System.out.println(s+"");
						}
						System.out.println();
						break;
				case 4:
					   System.out.println("Enter data that you want to search : ");
					   data = sc.next();
					   if(obj.contains(data))
						   System.out.println("The data is present at : "+(obj.indexOf(data)+1));
					   else
						   System.out.println("Element not found");
					   break;
				case 5:
						System.out.println("Thank you..");
						sc.close();
						return;
						
			   default:
				   		System.out.println("OOPS!....You enterd wrong option");
				   		return;
						
				}
				System.out.println("......................................................");
			}
		}catch(Exception e)
		{
     		System.out.println("Press only number...");
		}
	}
}
