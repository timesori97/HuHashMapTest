package main;

import java.util.Scanner;

import membership.memberFunction;
import memo.insertmd;

public class startmenu {

	private memberFunction mb = new memberFunction();
	private insertmd mo = new insertmd();
	
	

	public startmenu() {
		
		startmenu();
	}
	
	public void startmenu() {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			String num = in.nextLine();
			switch(num) {
			case"1":
				mb.addmb();
				break;
			case"2":
				mb.login(mo, mb);
				break;	
			case"3":
				System.out.println("종료합니다");
				flag = false;
				break;
			}
		}
	}
	public memberFunction getMb() {
		return mb;
	}

	public void setMb(memberFunction mb) {
		this.mb = mb;
	}

	public insertmd getMo() {
		return mo;
	}

	public void setMo(insertmd mo) {
		this.mo = mo;
	}
	
}
