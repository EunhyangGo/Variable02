package com.biz.var;

public class VariableType03 {

	public static void main(String[] args) {
		
		//boolean형에 대한 고찰
		int intNum1 = 30;
		int intNum2 = 40;
		
		//boolean은 비교 연산자를 통해 나온 결과
		boolean bNum;
		bNum = intNum1 < intNum2;
		System.out.println(bNum);
		
		bNum = (intNum1 > intNum2);
		System.out.println(bNum);
		
		bNum = (intNum1 <= intNum2);
		System.out.println(bNum);
		
		bNum = (intNum1 >= intNum2);
		System.out.println(bNum);
		
		System.out.println(bNum);
		
	}
}
