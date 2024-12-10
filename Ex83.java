package bookExercises;

import javax.swing.JOptionPane;

public class Ex83 {

	public static void main(String[] args) {

		String userAnswer;

		int a, b;

		Ex83methods ex = new Ex83methods();

		do {

			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Input first number:"));

			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Input second number:"));

			ex.gdc(a, b);

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");
	}

}
