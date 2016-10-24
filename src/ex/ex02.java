package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021026 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入一正整數n:");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int i =a;
		int sum =1;
		while(i>0){
			sum *=i;
			i--;
		}
		System.out.print(sum);
	}

}
