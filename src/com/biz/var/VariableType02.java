package com.biz.var;

public class VariableType02 {
	public static void main(String[] args) {
		
		// int���� float���� ���� ũ��(4byte)
		int intNum1 = 0;
		float floatNum1 = 0.0f;
		
		floatNum1 = intNum1;
		
		//intNum1 = floatNum1;
		
		floatNum1 = 123.456f ;
		System.out.println("floatNum1: " + floatNum1);
		
		
		intNum1 = 123456;
		floatNum1 = intNum1 ; // �ڵ� ����ȯ
		System.out.println("floatNum1: " + floatNum1);
		
		floatNum1 = 123.656f ;
		intNum1 = (int)floatNum1; // ���� ����ȯ = cascading
		System.out.println("intNum1: " + intNum1);
		
		
	}

}