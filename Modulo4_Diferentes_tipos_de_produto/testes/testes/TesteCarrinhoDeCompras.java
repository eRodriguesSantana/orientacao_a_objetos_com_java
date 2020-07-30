package testes;

import static org.junit.Assert.*;
import org.junit.Test;

import tarefa.CarrinhoDeCompras;
import tarefa.Produto;

public class TesteCarrinhoDeCompras {
	
	@Test
	public void testeQuantidadeNoCarrinho()
	{
		Produto p = new Produto(12, "Calça Jeans", 15);
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p, 3);
		assertEquals(CarrinhoDeCompras.getQuantidadeNoCarrinho(), 3);
		
	}




}