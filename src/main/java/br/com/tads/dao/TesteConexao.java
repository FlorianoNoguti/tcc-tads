package br.com.tads.dao;

import br.com.tads.modelo.Estado;


public class TesteConexao {
	

		public static void main(String[] args) {

			DAO dao = new DAO(null);
			Estado estado = new Estado();
			
			estado.setNome("Santa Catarina");
			estado.setSigla("SC");
			
			
			dao.adiciona(estado);

		}
	}


