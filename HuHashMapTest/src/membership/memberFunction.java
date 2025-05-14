package membership;

import java.util.HashMap;
import java.util.Scanner;

import memo.insertmd;



public class memberFunction {

	private HashMap<String,String> mbd = new HashMap<String,String>();
	private String id = null;
	private String password = null;
	private String loggedInUser = null;
	
	

	public String getLoggedInUser() {
		return loggedInUser;
	}


	public void membershipmenu() {
		 boolean flag = true;
		 Scanner in = new Scanner(System.in);
		 while(flag) {
			 System.out.println("1.회원가입 2.이전 메뉴로 돌아기기");
			 String num = in.nextLine(); 
			 switch(num) {
			 case"1":
				 addmb();
				 break;
			 case"2":
				 System.out.println("이전 메뉴로 돌아갑니다");
				 flag = false;
				 break;
			 }
		 }	 
	 }
	
	
	public void addmb() {
		Scanner in = new Scanner(System.in);
		memberFunction mb = new memberFunction();
		System.out.println("아이디를 생성하시오");
	    id = in.nextLine();
	    
	    System.out.println("비밀번호를 생성하시오");
	    password = in.nextLine();
	    
	    
	    mbd.put(id,password);
	    
	    
	    
	}
	public void login(insertmd md,memberFunction mb) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		System.out.println("----------------------------");
		System.out.println("로그인 화면 입니다");
		System.out.println("본인의 아이디를 쓰시오");
		String id = in.nextLine();
		if(mbd.containsKey(id)) {
			System.out.println("비밀번호를 쓰시오");
			String password = in.nextLine();
			if(mbd.get(id).equals(password)) {
				System.out.println("로그인이 되었습니다");
				loggedInUser = id;
				System.out.println("----------------------------");
				md.memomenu(mb);
			}else {
				System.out.println("비밀번호가 틀립니다");
				System.out.println("----------------------------");
			}
		}else {
			System.out.println("아이디가 틀립니다");
			System.out.println("----------------------------");
		}
		
		
		
	}
	 public HashMap<String, String> getMbd() {
			return mbd;
		}




		public void setMbd(HashMap<String, String> mbd) {
			this.mbd = mbd;
		}
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	
	
	
}
