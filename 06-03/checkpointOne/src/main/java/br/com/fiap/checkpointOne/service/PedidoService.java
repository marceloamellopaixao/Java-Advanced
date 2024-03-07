package br.com.fiap.checkpointOne.service;

import br.com.fiap.checkpointOne.model.Pedido;
import br.com.fiap.checkpointOne.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido salvarPedido(Pedido pedido){
        Pedido pedidoSalvo = pedidoRepository.save(pedido);
        return pedidoSalvo;
    }

    public List<Pedido> listPedidos(){
        return null;
    }

}
