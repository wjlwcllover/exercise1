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

	// 重写 equals 函数 判断两个对象是不是同一个 Groundhog对象（如果对象的内容相等，那么返回true，如果内容不相等就返回false）
	// 默认的equals 是比较的两个对象的内存地址是否相等。
	public boolean equals(Object object) {

		return (object instanceof Groundhog)
				&& (this.ghnumber == ((Groundhog) object).ghnumber);

	}
}

class Prediction {
	boolean shondow = Math.random() > 0.5;

	// 覆写toString方法
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
		
		
		
		// 这是由两个对象 构成的 Map 集合 ， 这个 Map 集合中的元素是一对 key-value 值
		HashMap<Groundhog, Prediction> hashMap = new HashMap<Groundhog, Prediction>();

		List<Groundhog> list = new ArrayList<Groundhog>();

		for (int i = 0; i < 9; i++) {
			Groundhog groundhog = new Groundhog(i);
			list.add(groundhog);
			hashMap.put(list.get(i), new Prediction());
		}

		// 打印信息的时候显示的是 map集合中的元素的key-value 值对，因此是对象的直接
		// toString（），也就是兑现的hashCode（）值。
		// 而 由于在Prediction 类中覆写了toString 方法，所以这个prediction 对象将会自动调用 他自己的
		// toString （）方法，从而是显示的six ..等信息

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

			// 打印groundhog对象的 值

			Syso.o(" groundhog is " + groundhog);
		}

	}

}
