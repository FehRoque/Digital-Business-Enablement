package br.com.fiap.loja;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("chamado para p�s venda");
	}

}
