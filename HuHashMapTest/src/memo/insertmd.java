package memo;

import java.util.HashMap;
import java.util.Scanner;

import membership.memberFunction;

public class insertmd {

	
	private HashMap<String,String> md  = new HashMap<String,String>();
	private String text = null;
	
	
	
	
	public void memomenu(memberFunction mb) {
		boolean flag = true;
		Scanner in = new Scanner(System.in);
		while(flag) {
			System.out.println("1.메모장 생성 2.메모장 조회 3.이전 메뉴로 돌아갑니다");
			String num = in.nextLine();
			switch(num) {
			case"1":
				addmd(mb);
				break;
			case"2":
			   selectmd(mb);
			   break;
			case"3":
				System.out.println("이전 메뉴로 돌아갑니다");
				flag = false;
				break;
			}
		}
	}
	
	
	
	public void addmd(memberFunction mb) {
		Scanner in = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("메모장을 생성 할 수 있습니다");
		System.out.println("본인의 아이디를 쓰시오");
		System.out.println("----------------------------");
		String id = in.nextLine();
		if(mb.getLoggedInUser().equals(id)) {
			 if(mb.getMbd().keySet().contains(id)) {
			    	System.out.println("내용을 쓰시오");
			    	String text = in.nextLine();
			    	md.put(id, text);
			    }	
		}else {
			System.out.println("다른 아이디입니다 본인의 아이디를 쓰시오");
		}
	   
	    
	    
	    
	}
	public void selectmd(memberFunction mb) {
		Scanner in = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("본인의 메모장을 조회 할 수 있습니다");
		System.out.println("본인의 아이디를 쓰시오");
		System.out.println("----------------------------");
		String id = in.nextLine();
	   if(mb.getLoggedInUser().equals(id)) {
		   if(md.containsKey(id)) {
				System.out.println(md.get(id));
			}   
	   }else {
		   System.out.println("다른 아이디입니다 본인의 아이디를 쓰시오");
	   }
		
	}
	
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
}
