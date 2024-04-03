package br.com.fiap.checkpointOne.repository;

import br.com.fiap.checkpointOne.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    public Pedido findAllByNomeDoCliente(String nomeCliente);
}
