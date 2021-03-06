package br.unibh.pessoas;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.pessoas.entidades.PessoaFisica;
import br.unibh.pessoas.persistencia.PessoaFisicaDAO;

public class Testes {

	@Test
	public void testePessoaFisicaFinAll(){
		
		PessoaFisicaDAO dao  = new PessoaFisicaDAO();
		List<PessoaFisica> l= dao.findAll();
		Assert.assertEquals(l.size(), 101);
		
	}
	
	@Test
	public void testePessoaFisicaFind(){
		PessoaFisicaDAO dao  = new PessoaFisicaDAO();
		PessoaFisica p = dao.find(6L);
		Assert.assertEquals(p.getNome(), "Ignatius H. Kaufman");

		
	}
	
}
