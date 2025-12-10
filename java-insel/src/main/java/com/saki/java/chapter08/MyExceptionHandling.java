package com.saki.java.chapter08;


public class MyExceptionHandling {

	public static void main(String[] args){
		String storageForArgs0 = args[0];
		String storageForArgs1 = args[1];
		
		try {
			
			double x = Double.parseDouble(args[0]);
			double y = Double.parseDouble(args[1]);
			System.out.printf("first double x multiplyed with second double y %n --> yields: %.2f * %.2f = %.3f %n", x, y, x*y);
		}
		catch (NumberFormatException e) {
			System.err.printf(" one of your Entries '%s' or '%s' is not a Double but something else%n", storageForArgs0, storageForArgs1);
			e.printStackTrace();

		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("the ExceptionHandling catched the error an the program continues working with code");
		System.out.printf(" just e.g. build the sum of %d + % d = % d",3,7,3+7);

		// TODO Auto-generated method stub  throws IOException

	}

}
