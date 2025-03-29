package br.com.gerenciador.api.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record  ProdutoRequestDTO (
    @NotBlank (message = "Nome é obrigatório")
    String nome,

    @NotNull (message = "Preco é obrigatório")
    @DecimalMin(value = "0.01", message = "Preço deve ser maior que zero")
    BigDecimal preco,

    String descricao,

    @NotNull(message = "Quantidade em estoque é obrigatório")
    @Min(value = 0, message = "quantidade negativa")
    Integer quantidadeEstoque,

    @NotNull(message = "fornecedor obrigatorio")
    Long fornecedorId
    ){
}
