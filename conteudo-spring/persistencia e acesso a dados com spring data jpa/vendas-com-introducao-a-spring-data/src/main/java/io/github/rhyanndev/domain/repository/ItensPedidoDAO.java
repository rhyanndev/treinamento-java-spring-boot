package io.github.rhyanndev.domain.repository;

import io.github.rhyanndev.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedidoDAO extends JpaRepository<ItemPedido, Integer> {
}
