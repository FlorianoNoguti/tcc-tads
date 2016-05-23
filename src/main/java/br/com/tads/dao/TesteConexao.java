package br.com.tads.dao;

import br.com.tads.modelo.Estado;


public class TesteConexao {

	

		public static void main(String[] args) {

			DAOGenerico dao = new DAOGenerico();
			Estado estado = new Estado();
			
			estado.setNome("Paraná");
			estado.setSigla_estado("PR");
			
			System.out.println("Funcionaaaaa");
			
			dao.inserir(estado);

		}
	}


