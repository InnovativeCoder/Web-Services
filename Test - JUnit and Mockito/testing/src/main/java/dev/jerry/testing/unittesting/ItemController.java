package dev.jerry.testing.unittesting;

import dev.jerry.testing.unittesting.business.ItemBusinessService;
import dev.jerry.testing.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    private ItemBusinessService businessService;
    @Autowired
    public ItemController(ItemBusinessService businessService){
        this.businessService = businessService;
    }

    @GetMapping("/dummy-item")
    public Item dummyItem(){
        return new Item(1, "Ball", 10,100);
    }

    @GetMapping("/item-from-business-service")
    public Item itemFromBusinessService(){
        return businessService.retreiveHardCodedItem();
    }
}
