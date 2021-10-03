package com.nicolasbncruz.app.item.models.service;

import com.nicolasbncruz.app.item.clientes.ProductClientRest;
import com.nicolasbncruz.app.item.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("serviceFeing")
@Primary
public class ItemServiceFeing implements ItemService{

    @Autowired
    private ProductClientRest clientFeing;

    @Override
    public List<Item> findAll() {
        return clientFeing.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        return new Item(clientFeing.detalle(id), cantidad);
    }
}
