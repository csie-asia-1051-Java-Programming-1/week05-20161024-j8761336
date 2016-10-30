package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int a=src.nextInt();
		int b=a;
		int c=1;
		while(true){
		if(b<10000){
			b=b*a;
			c++;}
		else{break;
					}
				}
		System.out.print(c);
		}
	}
