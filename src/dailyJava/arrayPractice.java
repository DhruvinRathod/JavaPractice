package dailyJava;

import java.util.Scanner;

/*Write a program to:
Create an array of size 5.
Take 5 integer inputs from the user and store them in the array.
Print the array elements in reverse order.
*/
public class arrayPractice {
	
	public static void main(String[] args) {
		int [] num = new int[5]; //initialization
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 integers:");
		for(int i =0;i<num.length;i++) {
			num[i] = sc.nextInt(); //user input
		}
		//Reversin the array
		System.out.println("Reversed array is:");
		for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
		//  Check if the array is a palindrome
		boolean isPalindrome=true;
		for (int i = 0;i<num.length/2;i++) {
			if(num[i]!=num[num.length -1-i]) {
				isPalindrome=false;
				break;
			}
		}
		System.out.println("is the array palindrome?:" +isPalindrome);
		
		//
		sc.close();
	}
	
	
}
