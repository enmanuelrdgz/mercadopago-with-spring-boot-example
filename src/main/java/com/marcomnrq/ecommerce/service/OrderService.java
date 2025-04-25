package com.marcomnrq.ecommerce.service;

import com.google.gson.Gson;
import com.mercadopago.resources.datastructures.preference.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {

    private final Gson gson = new Gson();


}
