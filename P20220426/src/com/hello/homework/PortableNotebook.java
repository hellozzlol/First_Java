package com.hello.homework;

public class PortableNotebook implements Notebook, Tablet {
	
	//필드 초기 값으로 대입
	
	int mode;
	
	//생성자
	
	public PortableNotebook () {
		
		this.mode=mode;
				mode= NOTEBOOK_MODE;
	}
	
	

	@Override
	public void watchVideo() {
		System.out.println("영상종류를 시청");

	}

	@Override
	public void useApp() {

	}

	@Override
	public void writeDocumentaion() {
		System.out.println("문서 프로그램을 통해 문서를 작성");
	}

	@Override
	public void searchInternet() {
		System.out.println("인터넷 브라우저를 통해 인터넷을 검색");

	}
	
	public void changeMode() {
		System.out.println("인터넷 브라우저를 통해 인터넷을 검색");
	
	}

}
