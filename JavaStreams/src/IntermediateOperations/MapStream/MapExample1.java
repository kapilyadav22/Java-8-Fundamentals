package IntermediateOperations.MapStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample1 {
	//Use to transform each element
	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("car", "bus", "truck", "flight", "auto");

		//convert vehicles name in uppercase and store it in other collections

		List<String> vehiclesListInUppercase = new ArrayList<>();

		//without stream
//		for(String name : vehicles) {
//			name.toUpperCase();
//			vehiclesListInUppercase.add(name);
//		}

		//streams
		vehiclesListInUppercase= vehicles.stream().map(name-> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehiclesListInUppercase);

	}

}
