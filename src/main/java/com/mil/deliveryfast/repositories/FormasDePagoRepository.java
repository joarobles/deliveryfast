package com.mil.deliveryfast.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mil.deliveryfast.models.FormaDePago;

@Repository
public interface FormasDePagoRepository extends CrudRepository<FormaDePago, Integer> {

}
