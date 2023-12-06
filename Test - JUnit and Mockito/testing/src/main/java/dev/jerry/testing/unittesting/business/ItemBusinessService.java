package dev.jerry.testing.unittesting.business;

import dev.jerry.testing.unittesting.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemBusinessService {
    public Item retreiveHardCodedItem(){
        return new Item(1,"Ball", 10,100);
    }
}
