package io.github.JoaoPimenta.produtosapi.repository;

import io.github.JoaoPimenta.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
