package com.mil.deliveryfast.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mil.deliveryfast.models.Pedido;

@Repository
public interface PedidosRepository extends CrudRepository<Pedido, Integer> {

}
