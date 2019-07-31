package com.cg.service;

import java.util.List;

import com.cg.entities.Trainee;



public interface TraineeService {
	Trainee find(int traineeId);
	List<Trainee> getAll();
	void create(Trainee t);
	void  delete(int traineeId);
	void modify(Trainee t);
	
}

