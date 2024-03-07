package br.com.fiap.checkpointOne.controller;

import br.com.fiap.checkpointOne.model.Pedido;
import br.com.fiap.checkpointOne.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    public ResponseEntity<Pedido> criarPedido

}
