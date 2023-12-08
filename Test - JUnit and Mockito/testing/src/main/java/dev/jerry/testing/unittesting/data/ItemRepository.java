package dev.jerry.testing.unittesting.data;

import dev.jerry.testing.unittesting.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
