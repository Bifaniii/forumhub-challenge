package com.guilhermebifani.demo.domain.topico;

import com.guilhermebifani.demo.domain.EstadoTopico;

public record DadosAtualizacaoTopico(
        String titulo,
        String mensagem,
        EstadoTopico status,
        String curso
) {}
