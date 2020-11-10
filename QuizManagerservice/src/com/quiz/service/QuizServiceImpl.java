/**
 * 
 */
package com.quiz.service;



import java.util.List;

import com.dao.model.IQuiz;
import com.model.User;
import com.moi.Quiz;
import com.quiz.service.util.Qfactory;


/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class QuizServiceImpl implements IQuizservice{

	IQuiz iquiz;
	
	
	public QuizServiceImpl(String datasource) {
		
		iquiz=Qfactory.get(datasource);
	}


	@Override
	public Quiz addquiz(Quiz q) {

		Quiz quiz = iquiz.save(q);
		return quiz;
	}


	@Override
	public List<Quiz> allquiz() {
		
		return iquiz.findAll();
	}


	@Override
	public User connect(String log, String pass) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void passerquiz(int idu, int idquiz) {
		// TODO Auto-generated method stub
		
	}


	
	
	

}
