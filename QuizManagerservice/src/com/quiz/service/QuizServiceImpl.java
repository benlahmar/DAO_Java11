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

	static IQuiz iquiz;
	
	
	public QuizServiceImpl(String datasource) {
		
		iquiz=Qfactory.get(datasource);
	}

	public static void datasource(String source)
	{
		iquiz=Qfactory.get(source);
	}

	public QuizServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
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


	@Override
	public User inscrire(User u) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<User> alluser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Quiz findById(int id) {
		
		return iquiz.findById(new Integer(id));
		
	}


	
	
	

}
