import java.util.ArrayList;
import java.util.List;

public class Animals_registry {
    public List<Animal> registry = new ArrayList();

    public Animals_registry() {
    }

    public void addAnimal(Animal animal) {
        this.registry.add(animal);
    }

    public String toString() {
        return "Animals_registry  registry = " + String.valueOf(this.registry);
    }
}
