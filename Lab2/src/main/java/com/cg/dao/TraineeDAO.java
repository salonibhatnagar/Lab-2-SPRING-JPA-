package com.cg.dao;

import java.util.List;

import com.cg.entities.Trainee;



public interface TraineeDAO {

		public void save(Trainee t);
		public Trainee findById(Integer traineeId);
		public List<Trainee> findAll();
		public void delete(Integer traineeId);
		public void modify(Trainee t);
	}

