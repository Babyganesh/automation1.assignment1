package automation1.assignment1;

import javax.crypto.interfaces.DHPublicKey;

public class Calculator {
	public void sum(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	public void sub(int num1,int num2){
		System.out.println(num1-num2);
	}
	public void mul(double num1,double num2) {
		System.out.println(num1*num2);
	}
	public void div(float num1,float num2) {
		System.out.println(num1/num2);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator opr=new Calculator();
		opr.sum(1, 5, 8);
		opr.sub(9, 3);
		opr.mul(25.6d, 58.5d);
        opr.div(6589.47f, 8967.59f);
	}
}





