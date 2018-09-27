package cp2_1주차;

import java.util.Scanner;

public class cp2_1주차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int line;
		System.out.println("몇 개의 줄로 별을 입력할까요?");
		System.out.println("---[1]---");
		line = sc.nextInt();
		if (line < 1) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < j + 1; k++) {
					System.out.print("*");
				}
				for (int l = 5; l > j + 1; l--) {
					System.out.print(" ");
				}
				System.out.println("");
			}
		} else {
			for (int j = 0; j < line; j++) {
				for (int k = 0; k < j + 1; k++) {
					System.out.print("*");
				}
				for (int l = line; l > j + 1; l--) {
					System.out.print(" ");
				}
				System.out.println("");
			}
		}

		System.out.println("몇 개의 줄로 별을 입력할까요?");
		System.out.println("---[2]---");
		line = sc.nextInt();
		if (line < 1) {
			for (int j = 5; j > 0; j--) {
				for (int k = j; k > 0; k--) {
					System.out.print("*");
				}
				for (int k = 0; k < 5; k++) {
					System.out.print(" ");
				}
				System.out.println("");
			}
		} else {
			for (int j = line; j > 0; j--) {
				for (int k = j; k > 0; k--) {
					System.out.print("*");
				}
				for (int k = 0; k < line; k++) {
					System.out.print(" ");
				}
				System.out.println("");
			}
		}

		System.out.println("몇 개의 줄로 별을 입력할까요?");
		System.out.println("---[3]---");
		line = sc.nextInt();
		if (line < 1) {
			for(int i=1; i<=5; i++) {
				for(int a=5-i; a>0; a--)
					System.out.print(" ");
				for(int a=1; a<i*2;a++)
					System.out.print("*");
				System.out.println();
			}
			for(int i=4; i>0;i--) {
				for(int a = 5-i;a>0; a--)
					System.out.print(" ");
				for(int a= 2*i-1; a>0; a--)
					System.out.print("*");
				System.out.println();
			}
		}
		else if (line%2 ==0) {
			System.out.println("홀수를 입력해주십시오");
		}
		else {
			for(int i=1; i<=line; i++) {
				for(int a=line-i; a>0; a--)
					System.out.print(" ");
				for(int a=1; a<i*2;a++)
					System.out.print("*");
				System.out.println();
			}
			for(int i=line-1; i>0;i--) {
				for(int a = line-i;a>0; a--)
					System.out.print(" ");
				for(int a= 2*i-1; a>0; a--)
					System.out.print("*");
				System.out.println();
			}
		}
	}

}
