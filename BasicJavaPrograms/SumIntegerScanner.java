package com.BasicJavaPrograms;

import java.util.Scanner;

public class SumIntegerScanner {
	public static void main(String[] args) {
		
	
	int sum = 0;
	int n,m;
System.out.println("enter your first num greater than 100");
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n<=100)
{
	System.out.print("please insert greater than 100");
}
System.out.print("enter your second  num less greater than 200");
m=s.nextInt();	
if(m>=200)
{
	System.out.print("please insert less than 200");
}

System.out.println(n+" "+m);
for(int i=n;i<m;i++)
{
	if(i%7==0)
	{
		sum=sum+i;
	}
}
System.out.println(sum);
	}
}


