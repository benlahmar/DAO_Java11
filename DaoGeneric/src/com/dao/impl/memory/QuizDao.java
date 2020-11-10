/**
 * 
 */
package com.dao.impl.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.dao.model.IQuiz;
import com.moi.Quiz;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class QuizDao implements IQuiz{

	 List<Quiz> quizz = new ArrayList<Quiz>();
	
	@Override
	public Quiz save(Quiz t) {
		quizz.add(t);
		return null;
	}

	@Override
	public Quiz findById(Integer k) {
		List<Quiz> ls = quizz.stream().filter(x -> x.getId()==k).collect(Collectors.toList());
		if(ls.size()>0)
			return ls.get(0);
		else
		return null;
	}

	@Override
	public List<Quiz> findAll() {
		// TODO Auto-generated method stub
		return quizz;
	}

	@Override
	public Quiz update(Integer k, Quiz t) {
		// TODO Auto-generated method stub
		return null;
	}

}
