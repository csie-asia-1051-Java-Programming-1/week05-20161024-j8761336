package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021026 周永振老師
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入一正整數:");
		Scanner scn =new Scanner(System.in);
		int a = scn.nextInt();
		int sum =1;
		for(int i=a;i>0;i--){
			sum *=i;
		}
		System.out.print(sum);
	}

}
