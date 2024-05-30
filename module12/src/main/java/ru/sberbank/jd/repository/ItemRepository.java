package ru.sberbank.jd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.jd.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
}
