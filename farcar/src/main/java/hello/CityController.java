package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {	

	private final List<City> cities = new ArrayList<>();
	
	public  CityController() {
		cities.add(new City(1,"Delhi"));
		cities.add(new City(2,"Mumbai"));
		cities.add(new City(3,"Calcutta"));
	}
	
	@RequestMapping("/cities")
	public List<City>getCities() {
		List<City>cities = new ArrayList<>();
		cities.add(new City(1,"Delhi"));
		cities.add(new City(2,"Mumbai"));
		cities.add(new City(3,"Calcutta"));
		return cities;
	}
}
