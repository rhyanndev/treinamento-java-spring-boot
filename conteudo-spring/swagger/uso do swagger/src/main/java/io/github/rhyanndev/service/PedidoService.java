package io.github.rhyanndev.service;

import io.github.rhyanndev.domain.entity.Pedido;
import io.github.rhyanndev.domain.enums.StatusPedido;
import io.github.rhyanndev.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
