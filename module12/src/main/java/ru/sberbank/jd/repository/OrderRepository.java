package ru.sberbank.jd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.jd.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
}