package com.biz.var;

public class VariableType04 {

	public static void main(String[] args) {
		
		char charAlpha = 'A';
		char charNum = '0';
		char charSpec = '%';
		char charSpace = ' ';
		
		System.out.println(charAlpha) ;
		System.out.println(charNum);
		System.out.println(charSpec);
		System.out.println(charSpace);
		
		// char ������ �������� int�� ������ �����ϸ� �ش� ������ ASCII�ڵ尡 ���� �ȴ�. 
		int intAlpha = charAlpha;
		int intNum = charNum;
		int intSpec = charSpec;
		int intSpace = charSpace;
		
		System.out.println("=== int Alpha");
		System.out.println(intAlpha) ;
		System.out.println(intNum);
		System.out.println(intSpec);
		System.out.println(intSpace);
		
		
		System.out.println(charAlpha + charNum);
		System.out.println(charAlpha + charSpec);
		System.out.println(charAlpha + charSpace);
		
		int intSQ = charAlpha + 20;
		System.out.println(intSQ); //charAlpah �ڵ尪(25) + 20
		System.out.println((char)intSQ); //a���ڷκ��� 20������ ���ڴ� �����̳�
		
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		
		System.out.println("===================");
		intAlpha = charAlpha;
		System.out.println((char)intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		
			
				
		
		
		
	}
}
