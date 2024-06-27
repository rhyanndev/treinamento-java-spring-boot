package io.github.rhyanndev.domain.repository;

import io.github.rhyanndev.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosDAO extends JpaRepository<Produto, Integer> {



}
