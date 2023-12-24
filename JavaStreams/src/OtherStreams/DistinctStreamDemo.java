package OtherStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStreamDemo {

	public static void main(String[] args) {
		List<String> vehicleslList = Arrays.asList("bike", "car", "bike", "auto", "plane", "cycle", "metro");

		//store distinct elements in another collection
		List<String> distinctVehicleList = vehicleslList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVehicleList);

		//to print without storing
		vehicleslList.stream().distinct().forEach(value->System.out.println(value));

		//count
		long count = vehicleslList.stream().distinct().count();
		System.out.println(count);

		//limit()
		List<String> limitedVehicles=vehicleslList.stream().limit(2).collect(Collectors.toList());
		System.out.println(limitedVehicles);

	}

}
