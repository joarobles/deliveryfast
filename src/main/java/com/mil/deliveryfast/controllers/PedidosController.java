package com.mil.deliveryfast.controllers;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mil.deliveryfast.models.Pedido;
import com.mil.deliveryfast.models.Usuario;
import com.mil.deliveryfast.repositories.FormasDePagoRepository;
import com.mil.deliveryfast.repositories.PedidosRepository;
import com.mil.deliveryfast.repositories.UsuariosRepository;

@Controller
@RequestMapping("pedidos")
public class PedidosController {
	
	public static final BigDecimal MONTO_COMISION = new BigDecimal(35);
	
	private @Autowired FormasDePagoRepository formasDePagoRepository;
	private @Autowired UsuariosRepository usuariosRepository;
	private @Autowired PedidosRepository pedidosRepository;
	
	@GetMapping("nuevo")
	public void pedirLoQueSea(Model model) {
		// a los fines del ejercicio dejamos fijo el número del
		// usuario que buscaremos en la base de datos
		// considerando que su cuenta ya ha sido creada con
		// anterioridad y ha iniciado sesión en la aplicación
		Usuario pabloAuster = usuariosRepository.findById(1).get();
		
		// agregamos las formas de pago disponible a nuestra vista
		// para poder mostrarlas en el combo de selección
		model.addAttribute("formasDePago", formasDePagoRepository.findAll());
		
		// pasamos a nuestra página un nuevo Pedido "en blanco"
		// creado para el usuario "Pablo Auster"
		model.addAttribute("pedido", new Pedido(pabloAuster));
		
		// pasamos a nuestra vista el monto de la comisión para
		// poder mostrarlo
		model.addAttribute("montoComision", MONTO_COMISION);
	}
	
	@PostMapping("nuevo")
	public void procesarPedidoDeLoQueSea(@Valid Pedido pedido, BindingResult resultado, Model model) {
		
	}

}
