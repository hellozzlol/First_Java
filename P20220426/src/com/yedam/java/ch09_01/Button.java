package com.yedam.java.ch09_01;

public class Button {
	
  OnClickListener listener;
  
  void setOnClickListenner(OnClickListener listener) {
	  this.listener = listener;
  }
  
	void touch() {
		listener.onClick();
	}
	
	
	
	
	
	
	
	
	
	static interface OnClickListener{
		void onClick();
		
	}

}
