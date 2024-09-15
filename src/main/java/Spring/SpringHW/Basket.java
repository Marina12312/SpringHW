package Spring.SpringHW;

import java.util.HashSet;
import java.util.Set;

public class Basket {
    private Set<Integer> items;

    public Basket() {
        this.items = new HashSet<>();
    }

    public void addItem(Integer item) {
        this.items.add(item);
    }

    public void addItems(Set<Integer> items) {
        this.items.addAll(items);
    }

    public Set<Integer> getItems() {
        return items;
    }
}