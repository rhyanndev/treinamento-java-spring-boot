package io.github.rhyanndev.domain.repository;

import io.github.rhyanndev.domain.entity.Cliente;
import io.github.rhyanndev.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidosDAO extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);

}
