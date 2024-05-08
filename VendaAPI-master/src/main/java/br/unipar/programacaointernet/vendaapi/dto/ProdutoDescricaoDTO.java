package br.unipar.programacaointernet.vendaapi.dto;

import java.math.BigDecimal;

public class ProdutoDescricaoDTO {

    private String descricao;
    private BigDecimal valor_unitario;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(BigDecimal valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
}
