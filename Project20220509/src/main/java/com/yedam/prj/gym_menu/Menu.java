package com.yedam.prj.gym_menu;

import java.util.Scanner;

import com.yedam.prj.dto.MemberVO;
import com.yedam.prj.dto.TrainerVO;
import com.yedam.prj.gym_Service.MemberService;
import com.yedam.prj.gym_Service.TrainerService;

public class Menu {
	        //멤버 변수 선언
			//생성자 선언
			//멤버 메소드(선언)
			//내가 봤을때도 코드 가 이해안가면 남도 안가니까 주석 처리 잘해주고
	// 콘솔창 가독성있게 처리할 것
			
		private	Scanner sc = new Scanner(System.in);
		private MemberService dao = new MemberService();//회원의 CRUD처리 dao객체
		private TrainerService dao1 = new TrainerService();//직원의 CRUD처리 dao1객체 생성
		//나는 회원관리 직원관리 둘다해야해서 메뉴에 직원관리 추가해야함
		
		
		public Menu() {
			
		}

		private void MainTitle() {
			//콘솔창을 띄웠을때 맨 처음 보이는 메뉴!(메인타이틀)
		   System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");
		   System.out.println("       1.회 원 관 리       ");
		   System.out.println("       2.직 원 관 리       ");
		   System.out.println("       3.종      료       ");
		   System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");
		}
		
		
		private void MemberTitle() {
			//1번 회원관리 누르면 나오게 되는 메뉴
			   System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");
			   System.out.println("        회 원 관 리        ");
			   System.out.println("  1. 전 체 회 원 조 회      ");
			   System.out.println("  2.   회 원 조 회         ");
			   System.out.println("  3.   회 원 등 록         ");
			   System.out.println("  4.   회 원 수 정         ");
			   System.out.println("  5.   회 원 삭 제         ");
			   System.out.println("  6.   돌 아 가 기         ");
			   System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");
			
		}
		
		private void TrainerTitle() {
			//1번 직원관리 누르면 나오게 되는 메뉴
			   System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");
			   System.out.println("        직 원 관 리        ");
			   System.out.println("  1. 전 체 직 원 조 회      ");
			   System.out.println("  2.   직 원 조 회         ");
			   System.out.println("  3.   직 원 등 록         ");
			   System.out.println("  4.   직 원 수 정         ");
			   System.out.println("  5.   직 원 삭 제         ");
			   System.out.println("  6.   돌 아 가 기         ");
			   System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");
			
		}
		
		private void MainMenu() {
			boolean b = false;//초기 값을 관례로 false라고함
			
			do {
				MainTitle();
				
				System.out.println("▶▶▶원하시는 작업을 선택하세요.");
				int code = sc.nextInt();
				
				switch(code) {
				
				case 1 : 
					MemberMenu();
					break;
				case 2 : 
					TrainerMenu();
					break;	
				case 3 : 
					b = true;
					sc.close();
					System.out.println("▶▶▶종료합니다.");
					break;	
				}
			
			}while(!b);
		
		}
		
		//회원메뉴를 만들어야지! 정신차리고 
		//회원메뉴 만들고 너는 트레이너 메뉴도 만들어야한다
		//정신차려!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		private void MemberMenu() {
			
			boolean b=  false;
			//회원관리 목록
			do {
				MemberTitle();
				System.out.println("▶▶▶원하시는 작업을 선택하세요");
				int code = sc.nextInt();
				switch(code) {
				
				case 1:
					System.out.println("▶▶▶전체회원 목록↓");
					dao.selectList();
					break;
				case 2:
					System.out.println("▶▶▶회원조회 내역↓");
					String id = sc.next();
					dao.selectMember(id);
					break;
				case 3:
					sc.nextLine();
					System.out.println("▶▶▶회원등록해주세요(생년월일,전화번호 정확하게 입력)");
					
					System.out.println("▶▶▶회원번호를 입력하세요↓");
					String nid = sc.nextLine();
					
					System.out.println("▶▶▶회원의 이름을 입력하세요");//회원이름
					String name = sc.nextLine();
					
					System.out.println("▶▶▶회원의 성별을 입력하세요");
				    String gender = sc.nextLine();//회원성별
				    
				    System.out.println("▶▶▶회원의 주소를 입력하세요");
				    String address = sc.nextLine();
				    
				    System.out.println("▶▶▶회원의 전화번호를 입력하세요");
				    String tel = sc.nextLine();
		
				    System.out.println("▶▶▶회원의 생년월일를 입력하세요.");
				    String birthday = sc.nextLine();
				    System.out.println("============================");
				    MemberVO vo = new MemberVO(nid,name,gender,address,tel,java.sql.Date.valueOf(birthday));
					dao.insertMember(vo);
					break;
				
				case 4:
					System.out.println("▶▶▶회원을 수정한다.");
					break;
				case 5:
					System.out.println("▶▶▶회원을 삭제한다.");
					break;
				case 6:
					b=true;
					break;
					
			
				}
			}while(!b);
		}
			
		// 밑에서 부턴 회원등록
			
			
			
			
		
			//여기서 부턴 직원영역
		//자 직원영역 그대로 보고 그대로 타이핑 치면 된다!!!!!!!!!!!!!!!!!
		//정신차리셈...ㅠ
		
			private void TrainerMenu() {
				boolean b =false;
				
			do {
				TrainerTitle();
				System.out.println("▶▶▶원하는 작업을 선택하세요.");
				int code = sc.nextInt();
				
			  switch(code) {
			  case 1:
				  System.out.println("▶▶▶전체직원 조회내역");
				  
				  dao1.selectList();
		
				  break;
			  case 2:
				  System.out.println("▶▶▶직원조회해주세요.");
				  String id = sc.next();
				  dao1.selectTrainer(id);
				  break;
				  
				  
				  
			  case 3:
				 
				  sc.nextLine();
					System.out.println("▶▶▶직원등록해주세요(생년월일,전화번호 정확하게 입력)");
					System.out.println("▶▶▶사번 입력하세요↓");
					String nid = sc.nextLine();
					System.out.println("▶▶▶직원의 이름을 입력하세요");//회원이름
					String name = sc.nextLine();
					System.out.println("▶▶▶직원의 성별을 입력하세요");
				    String gender = sc.nextLine();//회원성별
				    System.out.println("▶▶▶직원의 주소를 입력하세요");
				    String address = sc.nextLine();
				    System.out.println("▶▶▶직원의 전화번호를 입력하세요");
				    String tel = sc.nextLine();
				    System.out.println("▶▶▶직원의 생년월일를 입력하세요.");
				    String birthday = sc.nextLine();
				    System.out.println("============================");
				    TrainerVO vo = new TrainerVO(nid,name,gender,address,tel,java.sql.Date.valueOf(birthday));
				    dao1.insertTrainer(vo);
				    break;
				    
			  case 4:
				  System.out.println("▶▶▶직원 수정");
			  case 5:
				  System.out.println("▶▶▶직원 삭제");
			  case 6 :
				  
				  b=true;
				  break;
				
			  }
				
				
			
			}while(!b);
			
			}
			
		
			public void run() {
				MainMenu();
			}
	}
	
	
	


