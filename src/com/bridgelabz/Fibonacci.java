package com.bridgelabz;
import java.util.Scanner;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a,f=0,s=1;
System.out.println("Enter the number of elements you want to print of fibonacci series.. ");
a=sc.nextInt();
if(a == 0)
System.out.println("Fibonacci series has zero elements");
else if(a == 1)
System.out.println("Fibonacci series is : "+ f);
else if(a==2)
System.out.println("Fibonacci series is : "+f + s);
else
{
System.out.println("Fibonacci series is : " +f + s);
while(a>2)
{
s=s+f;
f=s-f;
System.out.println(" " +s);
a--;
}
}
}
}