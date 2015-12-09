import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ArrayTest1 {

	public int[] randomIntGenerate() {
		Random random = new Random();

		int[] a = new int[26];

		for (int j = 0; j < a.length; j++) {
			int i = random.nextInt(32) + 65;
			a[j] = i;

		}

		return a;

	}

	public char[] transform(int[] a) {
		char[] phxe = new char[26];

		for (int i = 0; i < phxe.length; i++) {
			phxe[i] = (char) a[i];
		}

		return phxe;

	}

	static Map fill (Map  m){
		m.put( "value",  "qvalue");
		m.put( "value1",  "qvalue1");
		m.put( "value2",  "qvalue2");
		m.put( "value3",  "qvalue3");
		m.put( "value4",  "qvalue4");
		m.put( "value5",  "qvalue5");
		
		return m;
	}
	
	public String[] generateArray(int n) {
		String[] arrayStrings = new String[n];
		for (int i = 0; i < n; i++) {
			arrayStrings[i] = "i" + i;
		}
		return arrayStrings;
	}

	public static void main(String[] args) {
		ArrayTest1 arrayTest1 = new ArrayTest1();
		String[] array = arrayTest1.generateArray(9);

		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]" + array[i]);
		}

		String[] arrayStrings = new String[9];
		System.arraycopy(array, 0, arrayStrings, 0, array.length);
		System.out.println("length :" + arrayStrings.length);
		for (int i = 0; i < arrayStrings.length; i++) {
			System.out.println("array[" + i + "]" + arrayStrings[i] + " ");
		}

		int i = 65;
		char ch = (char) i;
		System.out.println("ch = " + ch);

		System.out.println("**************************");
		int[] randomInt = arrayTest1.randomIntGenerate();

		char[] randomChar = arrayTest1.transform(randomInt);
		int count = 0;
		for (char c : randomChar) {
			System.out.println("char[" + i + "]" + c);
			i++;
		}

		for (int j = 0; j < 255; j++) {
			System.out.println("count = " + j);
			char ch12 = (char) j;

			System.out.println(" char " + "= " + ch12);
		}
		
		
		System.out.println( fill(new HashMap()));

		 
	}

}
