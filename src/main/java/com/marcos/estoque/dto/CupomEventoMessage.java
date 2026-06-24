package com.marcos.estoque.dto;

import java.math.BigDecimal;

public record CupomEventoMessage(Long id,
		String cpf,
		BigDecimal valor) {

}
