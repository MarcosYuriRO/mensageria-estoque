package com.marcos.estoque.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.marcos.estoque.dto.CupomEventoMessage;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CupomConsumer {
	
	@RabbitListener(queues = "vendas.cupom.criado.estoque")
	public void escutarCupomCriado(CupomEventoMessage mensagem) {
		log.info(" [RASTREIO] Nova mensagem recebida da fila de Vendas!");
        log.info("Processando baixa de estoque para o cupom ID: {}", mensagem.id());
        log.info("CPF do Cliente: {} | Valor total: R$ {}", mensagem.cpf(), mensagem.valor());
        
        log.info(" [SUCESSO] Estoque atualizado com sucesso para o cupom {}!", mensagem.id());
	}
}
