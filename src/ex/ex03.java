package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021026 周永振老師
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入一正整數:");
		Scanner scn =new Scanner(System.in);
		int a = scn.nextInt();
		int sum =0;
		int b =1;
		for(int i=1;i<=a;i++){
			b = b*2;
			sum+=b;
			
		}
		System.out.println(sum);
	}

}
