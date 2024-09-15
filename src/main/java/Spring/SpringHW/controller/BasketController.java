package Spring.SpringHW.controller;

import Spring.SpringHW.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order")
public class BasketController {
    @Autowired
    private BasketService basketService;

    @PostMapping("/add")
    public void addItem(@RequestParam("id") Integer... ids) {
        Set<Integer> items = Arrays.stream(ids).collect(Collectors.toSet());
        basketService.addItems(items);
    }

    @GetMapping("/get")
    public Set<Integer> getItems() {
        return basketService.getItems();
    }
}
