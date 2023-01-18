package com.example.microserviceadress.respositoryadress;

import com.example.microserviceadress.modeladress.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAdress extends JpaRepository<Address,Long> {
}
