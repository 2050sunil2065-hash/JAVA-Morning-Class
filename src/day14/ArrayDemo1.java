package day14;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		
		int size = input.nextInt();
		
		int[]arr = new int[size];
		for (int i = 0; i< arr.length; i++) {
			System.out.println("Enter element:");
			arr[i] = input.nextInt();
			
		}
		int sum = 0;
		for (int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
			
		}
		System.out.println("Sum of array elemnts is: " + sum);
	}//to print and sum of elemensts of an array

}
//array: is collection of elements of same data type arranged in sequential manner
