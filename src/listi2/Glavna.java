package listi2;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> iminja;
		iminja = new ArrayList<String>();
		iminja.add("nikola");
		iminja.add("pepe");
		iminja.add("martina");
		iminja.add("marija");
		iminja.stream()
		.filter(x -> x.length()<=5)
		.forEach(x -> System.out.println(x));
				
	}

}
