package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber
{

public static void main(String args[]){

System.out.println("--- Reverse Number Program ---\n");
System.out.print("Enter Number: ");
Scanner read = new Scanner(System.in);
int temp = read.nextInt();
// 0 error correction --important
System.out.print("Reverse of "+temp+" is: ");
while(temp%10==0){
System.out.print(0);
temp=temp/10;
}
if(temp%10!=0){
System.out.println(REV(temp));
}
}

static int REV(int n){

long RevNumber=0;
while (n>0)
{
RevNumber=(RevNumber*10)+(n%10);
n=n/10;
}
return (int) RevNumber;

}
}

