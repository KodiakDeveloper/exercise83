package bookExercises;

import javax.swing.JOptionPane;

public class Ex83methods {

	public void gdc(int a, int b) {

		int gdc;

		if (b > a) {

			int swap;

			swap = a;

			a = b;

			b = swap;
		}

		do {

			gdc = a % b;

			a = b;

			b = gdc;

		} while (gdc != 0);

		JOptionPane.showMessageDialog(null, "Greatest common divisor between value A and B : " + a);

	}

}
