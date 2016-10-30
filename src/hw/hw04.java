package hw;
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a =scn.nextInt();
		double b =0;
		for(int i =1;i<=a;i++){
			b +=1f/((2*i-1)*(2*i));
		}
		System.out.println(b);

	}

}
