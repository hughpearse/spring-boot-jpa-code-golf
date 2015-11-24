package myapplication.fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends  JpaRepository<Fruit, Long> {
	public Iterable<Fruit> findByNameContains(String name);
}