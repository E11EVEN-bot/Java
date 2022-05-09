package controlFlow;

public class Break_LabelledBreak {

	public static void main(String[] args) {

		System.out.println("Pattern");
		_break();
		System.out.println("Unlabelled Break");
		Unlabelledbreak();
		System.out.println("labelled Break");
		labelledbreak();
	}

	private static void _break() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	private static void Unlabelledbreak() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == 2)
					break;
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	private static void labelledbreak() {
		loop1: for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == 3)
					break loop1;
				System.out.print("* ");

			}
			System.out.println("");
		}
	}

}
