package Algorithm;

import java.util.Scanner;

public class reverse_integer_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int input = Integer.parseInt(s.nextLine());
	        System.out.println("Input:" + input);
	        int value = input;
	        System.out.println("Output:" + reverse(value));
	}
	 public static int reverse(int x) {
	        int sign = x < 0 ? -1 : 1;
	        int rev = 0;
	           while(x != 0){
	                rev = rev * 10 + x%10;
	                x = x/10;
	        }
	   	 return rev * sign;
	    }


}
