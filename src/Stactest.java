import java.util.LinkedList;
import java.util.Queue;


public class Stactest {

	private LinkedList<Object> list = new LinkedList<Object>();
	public void put (Object object ) 
	{
		list.addFirst(object);
	}
	
	public Object get() {
		return list.removeLast();
		
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public static void main(String[] argStrings ) {
		Stactest stactest = new Stactest();
		for (int i = 0; i < 10; i++) {
			stactest.put((Object)Integer.toString(i));
		}
		
		while (! stactest.isEmpty() )
		{
			System.out.println( " get from queue :" + stactest.get());
		}
		
	}
	
	
}
