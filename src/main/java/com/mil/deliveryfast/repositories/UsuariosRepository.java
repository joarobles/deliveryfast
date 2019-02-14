package com.mil.deliveryfast.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mil.deliveryfast.models.Usuario;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuario, Integer> {

}
