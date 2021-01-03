package mediatheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import mediatheque.entity.Item;

// This will be AUTO IMPLEMENTED by Spring 

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
