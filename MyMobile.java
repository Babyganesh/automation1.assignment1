package automation1.assignment1;

import java.security.PublicKey;

public class MyMobile {
	public void MakeCall() {
		String name ="vivo";
		System.out.println(name);
		}
	public void sendMsg() {
		boolean visible=true;
		System.out.println(visible);
		}
	private void payBills() {
		int num=2584;
		System.out.println(num);
		}
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		MyMobile MyMobile=new MyMobile();
		MyMobile.MakeCall();
		MyMobile.sendMsg();
		MyMobile.payBills();
		System.out.println("this is my mobile");
		}
	}
