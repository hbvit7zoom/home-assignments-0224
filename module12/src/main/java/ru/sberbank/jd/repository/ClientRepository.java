package ru.sberbank.jd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.sberbank.jd.entity.Client;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {

//    @Query if u need

    // Query methods
    List<Client> findClientsByFirstNameAndLastName(String firstName, String lastName);
}
