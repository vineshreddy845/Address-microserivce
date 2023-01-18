package com.example.microserviceadress.adressresponse;

import com.example.microserviceadress.modeladress.Address;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Data
@Component
public class AdrressResponse {
    private Optional<Address> AdressResponse;
}
