package com.wipro;

public class Calculator {
public static void main(String s[])
{
	Calculator  calc=new Calculator();
	System.out.println("Calculator output"+calc.add(100, 100));
}

public int add(int n1,int n2)
{
	return n1+n2;
}

}
