package com.udemy.loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		System.out.println("Enter a Number: ");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		for (int i = 0; i <= number; i++) {
			if (i > 100) {
				break;

			}

			if (i % 10 == 0) {
				System.out.println(i);
				continue;

			}

		}

	}

}
