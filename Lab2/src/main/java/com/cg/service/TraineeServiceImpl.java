package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.TraineeDAO;
import com.cg.entities.Trainee;
import com.cg.exception.ApplicationException;
@Service
@Transactional
public class TraineeServiceImpl  implements TraineeService{

		@Autowired private TraineeDAO dao;
		
		@Transactional(readOnly=true)
		//@Override
		public Trainee find(int traineeId) {
			Trainee t = dao.findById(traineeId);
			if(t==null )
			{
				throw new ApplicationException("Trainee with id "+traineeId+" does not exist");
			}
			return  t;
		}

		@Transactional(readOnly=true)
		//@Override
		public List<Trainee> getAll() {
			List<Trainee> trainee =dao.findAll();
			if(trainee==null || trainee.isEmpty())
			{
				throw new ApplicationException("No trainees Found");
			}
			return trainee;
		}

		@Transactional(propagation=Propagation.REQUIRED)
		//@Override
		public void create(Trainee t) {
			
			Trainee t1 = dao.findById(t.getTraineeId());
			if(t1==null)
				dao.save(t);
			else
				throw new ApplicationException("Trainees with id "+t.getTraineeId()+" Already exists");
			
			
		}
		public void delete(int traineeId)
		{Trainee t2 = dao.findById(traineeId);
		if(t2!=null) {
			dao.delete(traineeId);
		}
		else
		{
			throw new ApplicationException("Trainees with id "+traineeId+" is not present");
		}
		}
		public void modify(Trainee t) {
			Trainee t3 = dao.findById(t.getTraineeId());
			if(t3!=null) {
			dao.modify(t);
		}
			else
			{
				throw new ApplicationException("Trainees with id "+t.getTraineeId()+" is not present");
			}
	}
		}

