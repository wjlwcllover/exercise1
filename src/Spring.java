import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import selfdefine.*;
 
class Groundhog {
	int ghnumber;

	public Groundhog(int n) {
		// TODO Auto-generated constructor stub
		ghnumber = n;
	}

	// ��д equals ���� �ж����������ǲ���ͬһ�� Groundhog������������������ȣ���ô����true��������ݲ���Ⱦͷ���false��
	// Ĭ�ϵ�equals �ǱȽϵ�����������ڴ��ַ�Ƿ���ȡ�
	public boolean equals(Object object) {

		return (object instanceof Groundhog)
				&& (this.ghnumber == ((Groundhog) object).ghnumber);

	}
}

class Prediction {
	boolean shondow = Math.random() > 0.5;

	// ��дtoString����
	public String toString() {
		if (shondow) {
			return "Six more weeks of Winter ";
		} else {
			return "Early Spring";
		}
	}
}

public class Spring {

	public void testThis() {
		System.out.println( " \"this\" is " + this + "\n"+ " this.getClass() is " + this.getClass().getName());
		
		System.out.println( " this.hashCode() is " +this.hashCode()  + " "+ Integer.toHexString(27134973));
		 
		String string = "Hello";
		String string2 = "Hello";
		
		String string3 = "Hello";
		
		String string5 = "Hello";
		
		String string4 = "Hello";
		
		String string6 = "Hello";
		
		System.out.println( string + hashCode());
		System.out.println( string2 + hashCode());
		System.out.println( string3 + hashCode());
		System.out.println( string4 + hashCode());
		System.out.println( string5 + hashCode());
		System.out.println( string6 + hashCode());
		
		
		System.out.println("***************************8");
		
		System.out.println( "Hello" + hashCode());
		System.out.println( "Hello" + hashCode());
	}
	
	public static void main(String[] args) {

		Spring spring = new Spring();
		spring.testThis();
		
		System.out.println( spring.toString());
		
		
		
		// �������������� ���ɵ� Map ���� �� ��� Map �����е�Ԫ����һ�� key-value ֵ
		HashMap<Groundhog, Prediction> hashMap = new HashMap<Groundhog, Prediction>();

		List<Groundhog> list = new ArrayList<Groundhog>();

		for (int i = 0; i < 9; i++) {
			Groundhog groundhog = new Groundhog(i);
			list.add(groundhog);
			hashMap.put(list.get(i), new Prediction());
		}

		// ��ӡ��Ϣ��ʱ����ʾ���� map�����е�Ԫ�ص�key-value ֵ�ԣ�����Ƕ����ֱ��
		// toString������Ҳ���Ƕ��ֵ�hashCode����ֵ��
		// �� ������Prediction ���и�д��toString �������������prediction ���󽫻��Զ����� ���Լ���
		// toString �����������Ӷ�����ʾ��six ..����Ϣ

		Syso.cancelIt = true;
		Syso.o(" hashmap = " + hashMap + "\n");
		Syso.o();
		Syso.o("#3:");
		Groundhog groundhog = new Groundhog(3);

		Syso.o("if groundhog.equals(list.get(3)) "
				+ groundhog.equals(list.get(3)));

		Syso.o();

		Syso.o("hash.get(4)" + hashMap.get(list.get(4)));
		Syso.o("list(4) is " + list.get(4));

		Syso.o("***********************");
		if (hashMap.containsKey(groundhog.equals(list.get(3)) ? list.get(3)
				: groundhog)) {
			Syso.o((Prediction) (hashMap.get(list.get(3))));

		} else {
			Syso.o("No Groudhog(3) is found");

			// ��ӡgroundhog����� ֵ

			Syso.o(" groundhog is " + groundhog);
		}

	}

}
