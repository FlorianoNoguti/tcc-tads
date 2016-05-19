package br.com.tads.dao;


	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.Query;

	public class DAOGenerico { 
		private static EntityManager entityManager;

		public void inserir(Object objeto) {
			entityManager = ConexaoBanco.getConexao().getEm();
			try {
				entityManager.getTransaction().begin();
				entityManager.persist(objeto);
				entityManager.getTransaction().commit();

			} catch (Exception e) {
				entityManager.getTransaction().rollback();
				e.printStackTrace();
			}
		}

		public void alterar(Object objeto) {
			entityManager = ConexaoBanco.getConexao().getEm();
			try {
				entityManager.getTransaction().begin();
				entityManager.merge(objeto);
				entityManager.getTransaction().commit();
			} catch (Exception e) {
				entityManager.getTransaction().rollback();
				e.printStackTrace();
			}
		}
	}


