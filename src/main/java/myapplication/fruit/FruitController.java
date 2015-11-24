package myapplication.fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruit")
public class FruitController {
	@Autowired
	FruitRepository repository;
	
	@RequestMapping(value="/add", method= RequestMethod.GET)
	public Fruit addfruit(@RequestParam(value="name") String name) {
		Fruit afruit = new Fruit(name);
		repository.save(afruit);
		return afruit;
    }
	
	@RequestMapping("/all")
	public Iterable<Fruit> listfruits(){
		return repository.findAll();
	}
	
	@RequestMapping("/search")
	public Iterable<Fruit> findbyname(@RequestParam(value="name") String name){
		return repository.findByNameContains(name);
	}
}