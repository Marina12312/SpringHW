package Spring.SpringHW.service;
import Spring.SpringHW.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@Service
@SessionScope
public class BasketService {

    private final Basket basket;

    public BasketService() {
        this.basket = new Basket();
    }

    public void addItem(Integer item) {
        basket.addItem(item);
    }

    public void addItems(Set<Integer> items) {
        basket.addItems(items);
    }

    public Set<Integer> getItems() {
        return basket.getItems();
    }
}
