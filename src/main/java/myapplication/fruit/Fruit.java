package myapplication.fruit;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fruit {
	@Id
	private String name;
	
	protected Fruit() {}

	public Fruit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}