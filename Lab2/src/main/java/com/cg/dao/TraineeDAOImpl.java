package com.cg.dao;



	
	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;
	import javax.persistence.Query;

	import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;

	


	@Repository
	public class TraineeDAOImpl implements TraineeDAO {

		@PersistenceContext
		private EntityManager em;
		
		public void save(Trainee t) {
			em.persist(t);
			em.flush();
		}
		public Trainee findById(Integer traineeId) {
			return em.find(Trainee.class, traineeId);
		}

		public List<Trainee> findAll() {
			Query q = em.createQuery("from Trainee tt");//That's "JPQL" not SQL !!!
			return q.getResultList();
		}
		public void delete(Integer traineeId)
		{ Trainee t = em.find(Trainee.class, traineeId);
			em.remove(t);
		}
		public void modify(Trainee t) {
			em.merge(t);
			em.flush();
		}

	}

