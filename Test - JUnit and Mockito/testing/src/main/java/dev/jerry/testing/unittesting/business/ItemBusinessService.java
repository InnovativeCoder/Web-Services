package dev.jerry.testing.unittesting.business;

import dev.jerry.testing.unittesting.data.ItemRepository;
import dev.jerry.testing.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemBusinessService {
    @Autowired
    private ItemRepository repository;
    public Item retreiveHardCodedItem(){
        return new Item(1,"Ball", 10,100);
    }
}
