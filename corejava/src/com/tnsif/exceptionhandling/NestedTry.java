package com.tnsif.exceptionhandling;

public class NestedTry {
	public static void chack() {
		String str = "tns";
		int arr[] = null;
		int y=6;
		
		try {
			//int z = y/0;//exception araised in outer try
			try {//inner try
				System.out.println(arr[0]);
				System.out.println(str.charAt(y));	
			}
			catch(StringIndexOutOfBoundsException e) {//inner catch
				System.out.println("exception caught"+e.getMessage());
			}
			catch(NullPointerException f) {//inner catch
				System.out.println("exception caught"+f.getMessage());
			}
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught"+e.getMessage());
		}
	}

}
