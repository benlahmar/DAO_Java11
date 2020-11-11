/**
 * 
 */
package com.client;

import java.util.List;
import java.util.Set;

import com.model.User;
import com.moi.Question;
import com.moi.Quiz;


/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public interface IManager {

	public Quiz getBuId(int id);
	
	public void passerquiz(int idquiz);
	
	public Set<User> users();
	
	public List<Question> notresponse(Quiz q);
	public int score(Quiz q, int idu);
}
