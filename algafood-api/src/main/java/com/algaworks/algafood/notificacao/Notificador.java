package com.algaworks.algafood.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}