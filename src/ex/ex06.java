package ex;

import java.util.Random;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021026 周永振老師
 */
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] data = new int[n];
		for (int i=0;i<n;i++){
			data[i] = scn.nextInt();
		}
			int a=0;
			int b=0;	
			int c=0;			
		for(int j=0;j<n;j++){
			for(int k=0;k<n;k++){
				if(data[k]>a){
					a=data[k];
					b=k;
				}
			}
			c=a;
			data[b]=-1;
			a=0;
					b=0;
					System.out.print(c);
		}
}
}
