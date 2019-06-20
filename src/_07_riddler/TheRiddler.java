package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String a=JOptionPane.showInputDialog("What is 2+2?");
		String b="4";
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(a.equals(b)) {
			JOptionPane.showMessageDialog(null, "correct");
			score=score+1;
			} else{JOptionPane.showMessageDialog(null, "Wrong, answer=4!!!");}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String c=JOptionPane.showInputDialog("What is 3*2?");
		String d="6";
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(c.equals(d)) {
			JOptionPane.showMessageDialog(null, "correct");
			score=score+1;
			} else{JOptionPane.showMessageDialog(null, "Wrong, answer=6!!!");}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "score:"+score);
	}
}

