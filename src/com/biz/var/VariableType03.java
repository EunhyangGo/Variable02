package com.biz.var;

public class VariableType03 {

	public static void main(String[] args) {
		
		//boolean���� ���� ����
		int intNum1 = 30;
		int intNum2 = 40;
		
		//boolean�� �� �����ڸ� ���� ���� ���
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
