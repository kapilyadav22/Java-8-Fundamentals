package OtherStreams;

import java.util.Arrays;
import java.util.List;

public class ToArrayExample {

	public static void main(String[] args) {
		
		List<String> stringlList = Arrays.asList("A", "B", "C", "1", "2","3","4");
		Object arr[] = stringlList.stream().toArray();
		
		//System.out.println(arr.length);
		
		for(Object data: arr) {
			System.out.println(data);
		}
	}

}
