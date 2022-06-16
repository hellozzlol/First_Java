package PPPP;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingPractice {
	public static void main( String[] args ) {
		JFrame f = new JFrame();//윈도우 창을 하나 생성한다.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setTitle("MyGYM");
    	f.setSize(1024, 768);
    	f.setLayout(new FlowLayout());//배치관리자 설정
    	f.getContentPane().setBackground(Color.PINK);
    
    	JPanel p = new JPanel();
    	p.setSize(500,400);
    	f.setVisible(true);
   
    	JButton btn = new JButton("1.회원관리");
    	f.add(btn,"CENTER");
    	btn.setBounds(0,0, 200, 100);
    	btn.setPreferredSize(new Dimension(200,200));
    	btn.setBackground(new Color(240,128,50));   	
    	btn.setFont(new Font("맑은고딕",Font.BOLD,30));
    	
    	JButton btn1 = new JButton("2.직원관리");
    	btn1.setPreferredSize(new Dimension(200,200));
    	f.add(btn1,"CENTER");
    	btn1.setBounds(0,200, 200, 100);
    	btn1.setBackground(new Color(240,128,50));
    	btn1.setFont(new Font("맑은고딕",Font.BOLD,30));
    	
    	JPanel p2 = new JPanel();
    	JButton btn2 = new JButton("3.종료");
    	f.add(btn2,"CENTER");
    	btn2.setPreferredSize(new Dimension(200,200));
    	btn2.setBackground(new Color(240,128,50));
    	btn2.setBounds(0,400, 200, 100);
    	btn2.setFont(new Font("맑은고딕",Font.BOLD,30));
    	
    	
    	JPanel p3 = new JPanel();
    	p.setSize(500,400);
    	f.setVisible(true);
    	f.setVisible(true);
    	f.setVisible(true);
    	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    	
	}

}
