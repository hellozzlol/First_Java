package com.yedam.prj.gym_app;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.yedam.prj.gym_menu.Menu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    
    {
    	//JFrame f = new JFrame();//윈도우 창을 하나 생성한다.
    	//f.setTitle("MyGYM");
    	//f.setSize(1024, 768);
    	//f.setLayout(new FlowLayout());//배치관리자 설정
    	
    	//JButton btn = new JButton("회원관리");
    	
    	//JPanel p = new JPanel();
    	//p.setSize(100,100);
    	//f.add(btn);
    	
    	//JButton btn1 = new JButton("직원관리");
    	//f.add(btn1);
    	//f.setVisible(true);
    	
    	
    	
        Menu menu = new Menu();
        menu.run();
    }
}
