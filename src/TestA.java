public class TestA {

	public class GeneraterString implements MapGenerate {

		private int index = 1;
		private String[][] dStrings;

		public GeneraterString(String[][] data) {
			// TODO Auto-generated constructor stub
			dStrings = data;
		}

		public Pair next() {
			// TODO Auto-generated method stub
			index = (index + 1) % dStrings.length;
			return new Pair(dStrings[index][0], dStrings[index][1]);

		}

	}
}
