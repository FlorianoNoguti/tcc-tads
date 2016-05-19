package br.com.tads.dao;

import br.com.tads.modelo.TipoManutencao;

public class TesteConexao {

	

	

	

		public static void main(String[] args) {

			DAOGenerico dao = new DAOGenerico();
			TipoManutencao tpManut = new TipoManutencao();

			tpManut.setDescricao("funcionaaaaaaaaa");

			dao.inserir(tpManut);
		}
	}


