package ch07;

import java.awt.*;
import java.awt.event.*;

public class Ex7_18 {
	
	// 익명 클래스 작성법
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!");
			}
		});
	}
}

	
