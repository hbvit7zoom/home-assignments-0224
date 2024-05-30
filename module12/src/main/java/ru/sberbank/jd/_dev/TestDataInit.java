package ru.sberbank.jd._dev;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.sberbank.jd.entity.Client;
import ru.sberbank.jd.entity.Item;
import ru.sberbank.jd.entity.Order;
import ru.sberbank.jd.repository.ClientRepository;
import ru.sberbank.jd.repository.ItemRepository;
import ru.sberbank.jd.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Profile("test-data")
@Component
@AllArgsConstructor
@Slf4j
public class TestDataInit {

    private ClientRepository clientRepository;
    private OrderRepository orderRepository;
    private ItemRepository itemRepository;

    @PostConstruct
//    @Transactional
    public void initData() {
        Client client = new Client();
        client.setFirstName("Nikita");
        client.setLastName("Kozlov");
        clientRepository.save(client);
        clientRepository.flush();

        Item item1 = new Item();
        item1.setArticle("123d");
        item1.setName("Wood");
        item1.setPriceRub(200d);

        Item item2 = new Item();
        item2.setArticle("555ee");
        item2.setName("Bike");
        item2.setPriceRub(200d);

        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.flush();

        log.info("Before Client ID = {}", client.getId());
        Client client1 = clientRepository.findById(client.getId()).get();
//        client1.setId("123");
        log.info("After Client ID = {}", client1.getId());
        Order order = new Order();
        order.setClient(client1);

        orderRepository.save(order);
        orderRepository.flush();

        item1.setOrder(order);
        item2.setOrder(order);
        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.flush();

        Client client2 = clientRepository.findById(client.getId()).get();
        log.info("Client2 ID = {}", client2.getId());
        client2.getOrders().clear();
//        client.getOrders();
    }
}
