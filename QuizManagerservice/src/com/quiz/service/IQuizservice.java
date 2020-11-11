/**
 * 
 */
package com.quiz.service;

import java.util.List;

import com.model.User;
import com.moi.Quiz;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public interface IQuizservice {

	public  static String datasource = "memory";
	public Quiz addquiz(Quiz q);
	public List<Quiz> allquiz();
	public Quiz findById(int id);
	
	
	public User inscrire(User u);
	public List<User> alluser();
	public User connect(String log, String pass);
	
	
	public void passerquiz(int idu, int idquiz);
	
}
