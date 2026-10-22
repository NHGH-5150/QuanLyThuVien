package NHGH;

import java.util.Scanner;

public class Tuan2 {
	public static void main(String[] args)
	{		
		System.out.println("Thực hành lập trình hướng đối tượng. Tuần 2");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Số đầu tiên: ");
		int FirstNumber = scanner.nextInt();
		
		System.out.println("Số thứ hai: ");
		int SecondNumber = scanner.nextInt();
		
		System.out.println("Min = " + Math.min(FirstNumber, SecondNumber) + "\nMax = " + Math.max(FirstNumber, SecondNumber));
		
		scanner.close();
	}
}
