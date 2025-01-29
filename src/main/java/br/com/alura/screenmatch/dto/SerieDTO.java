package br.com.alura.screenmatch.dto;

import br.com.alura.screenmatch.model.CategoriaEnum;

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Double avaliacao,
                       CategoriaEnum genero,
                       String atores,
                       String poster,
                       String sinopse) {
}
