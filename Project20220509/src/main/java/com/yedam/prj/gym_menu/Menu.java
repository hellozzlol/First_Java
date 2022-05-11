package com.yedam.prj.gym_menu;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
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
		private List<MemberVO> MEMBERS = new ArrayList<MemberVO>();
		private List<TrainerVO>TRAINER = new ArrayList<TrainerVO>();
		private	Scanner sc = new Scanner(System.in);
		private MemberService dao;//회원의 CRUD처리 dao객체
		private TrainerService dao1;//직원의 CRUD처리 dao1객체 생성
		//나는 회원관리 직원관리 둘다해야해서 메뉴에 직원관리 추가해야함
		
		
		public Menu() { //생성시 초기화 및 dao 객체 초기화
			init();
			dao = new MemberService(MEMBERS);
			dao1 = new TrainerService(TRAINER);
		}

		private void init() {
			MEMBERS.add(new MemberVO("05-0509","김미나","여","165cm","60kg","대구광역시","010-1234-5679",Date.valueOf("2000-01-01")));
			MEMBERS.add(new MemberVO("05-0510","김소연","여","175cm","49kg","대구광역시","010-6595-5689",Date.valueOf("1995-12-01")));
			MEMBERS.add(new MemberVO("05-0511","김하늘","여","151cm","80kg","대구광역시","010-9585-5659",Date.valueOf("1997-05-07")));
			MEMBERS.add(new MemberVO("05-0512","박하진","여","155cm","55kg","대구광역시","010-4854-9375",Date.valueOf("1994-06-01")));
			MEMBERS.add(new MemberVO("05-0513","최민진","여","162cm","66kg","대구광역시","010-6585-4785",Date.valueOf("1990-08-01")));
			MEMBERS.add(new MemberVO("05-0514","이채연","여","164cm","70kg","대구광역시","010-9512-6511",Date.valueOf("1996-07-01")));
			TRAINER.add(new TrainerVO("16-0315","2016-03-15","손현우","남","대구광역시","010-9545-5461",Date.valueOf("1992-12-12")));
			TRAINER.add(new TrainerVO("16-0510","2016-05-10","박성진","남","대구광역시","010-6595-1245",Date.valueOf("1993-05-07")));
			TRAINER.add(new TrainerVO("17-0511","2017-05-11","정세운","남","대구광역시","010-9875-1147",Date.valueOf("1997-07-07")));
			TRAINER.add(new TrainerVO("18-0512","2018-05-12","윤민우","남","대구광역시","010-6548-1268",Date.valueOf("1994-11-01")));
			TRAINER.add(new TrainerVO("19-0513","2019-05-13","김태현","남","대구광역시","010-1005-1289",Date.valueOf("1990-10-01")));
			TRAINER.add(new TrainerVO("20-0514","2020-05-14","김원필","남","대구광역시","010-9564-1028",Date.valueOf("1996-01-01")));
			
			
			
			
			
			
	
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
			   System.out.println("       회 원 관 리        ");
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
					System.out.println("▶▶▶회원검색 내역↓");//회원검색
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
					
					System.out.println("▶▶▶회원의 성별을 입력하세요");//회원성별
				    String gender = sc.nextLine();
				    
				    System.out.println("▶▶▶회원의 키 를 입력하세요");//회원 키
				    String height = sc.nextLine();
				    
				    System.out.println("▶▶▶회원의 몸무게를  입력하세요");//회원 몸무게
				    String weight = sc.nextLine();
				  
				    System.out.println("▶▶▶회원의 주소를 입력하세요");//회원주소
				    String address = sc.nextLine();
				    
				    System.out.println("▶▶▶회원의 전화번호를 입력하세요");//회원 전화번호
				    String tel = sc.nextLine();
		
				    System.out.println("▶▶▶회원의 생년월일를 입력하세요.");//회원생년월일
				    String birthday = sc.nextLine();
				    System.out.println("============================");
				    MemberVO vo = new MemberVO(nid,name,gender,height,weight,address,tel,java.sql.Date.valueOf(birthday));
					dao.insertMember(vo);
					break;
				
				case 4:
					System.out.println("▶▶▶수정할 사람을 검색해주세요");
					  String name2 = sc.next();   
					  dao.memberModify(name2);
					  System.out.println("▶▶▶수정되었습니다.");
					  break;
				
				
				case 5:
					System.out.println("▶▶▶회원정보를 삭제한다.");
					String name1 = sc.next();
					dao.memberDel(name1);
					System.out.println("▶▶▶삭제되었습니다.");
					
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
					System.out.println("▶▶▶직원의 이름을 입력하세요");//직원이름
					String name = sc.nextLine();
					System.out.println("▶▶▶직원의 입사년도를 입력하세요");
					String join = sc.nextLine();
					System.out.println("▶▶▶직원의 성별을 입력하세요");
				    String gender = sc.nextLine();//직원성별
				    System.out.println("▶▶▶직원의 주소를 입력하세요");
				    String address = sc.nextLine();
				    System.out.println("▶▶▶직원의 전화번호를 입력하세요");
				    String tel = sc.nextLine();
				    System.out.println("▶▶▶직원의 생년월일를 입력하세요.");
				    String birthday = sc.nextLine();
				    System.out.println("============================");
				    TrainerVO vo = new TrainerVO(nid,name,join,gender,address,tel,java.sql.Date.valueOf(birthday));
				    dao1.insertTrainer(vo);
				    break;
				    
			  case 4:
				  System.out.println("▶▶▶수정할 사람을 검색해주세요");
				  String name2 = sc.next();   
				  dao1.trainerModify(name2);
				  System.out.println("▶▶▶수정되었습니다.");
				  break;
				  
				  
			  case 5:
				  System.out.println("▶▶▶직원 삭제");
				  System.out.println("▶▶▶직원정보를 삭제한다.");
					String name1 = sc.next();
					dao1.trainerDel(name1);
					System.out.println("▶▶▶삭제되었습니다.");
					break;
				  
				  
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
	
	
	


