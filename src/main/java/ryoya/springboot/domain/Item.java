package ryoya.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

	private int id;
	private String name;
	private int condition;
	private int category;
	private String brand;
	private int price;
	private int shipping;
	private String description;
	
}
