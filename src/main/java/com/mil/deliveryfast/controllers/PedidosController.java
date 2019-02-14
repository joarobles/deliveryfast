package com.mil.deliveryfast.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mil.deliveryfast.models.Pedido;

@Controller
@RequestMapping("pedidos")
public class PedidosController {
	
	@GetMapping("nuevo")
	public void pedirLoQueSea(Model model) {
		
	}
	
	@PostMapping("nuevo")
	public void procesarPedidoDeLoQueSea(@Valid Pedido pedido, BindingResult resultado, Model model) {
		
	}

}
