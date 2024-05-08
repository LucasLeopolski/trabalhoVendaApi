package br.unipar.programacaointernet.vendaapi.mapper;

import br.unipar.programacaointernet.vendaapi.dto.ProdutoDescricaoDTO;
import br.unipar.programacaointernet.vendaapi.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoMapper {

    public static List<ProdutoDescricaoDTO>
    toDTO(List<Produto>produtoList){

        List<ProdutoDescricaoDTO> dtoList = new ArrayList<>();

        for (Produto produto : produtoList){
            ProdutoDescricaoDTO dto = new ProdutoDescricaoDTO();
            dto.setDescricao(produto.getDescricao());
            dto.setValor_unitario(produto.getValor_unitario());

            dtoList.add(dto);
        }

        return dtoList;
    }
}
