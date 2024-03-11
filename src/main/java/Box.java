import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitList = new ArrayList<>();
    private float weight;

    public void addFruit(T fruit) {
        this.fruitList.add(fruit);
        this.weight += fruit.getWeight();
    }

    public float getWeight() {
        return this.weight;
    }

    public boolean compare(Box box) {
        return this.weight == box.weight;
    }

    public void emptyBox(Box<T> box) {
        if (box.fruitList.size() > 0) {
            this.fruitList.addAll(box.fruitList);
            this.weight += box.getWeight();
            box.fruitList = new ArrayList();
            box.weight = 0f;
        }
    }
}
