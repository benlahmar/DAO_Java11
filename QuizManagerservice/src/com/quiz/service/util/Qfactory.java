/**
 * 
 */
package com.quiz.service.util;

import java.util.ServiceLoader;

import com.dao.model.IQuiz;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class Qfactory {

	public static IQuiz get(String source)
	{
		IQuiz res = null;
		ServiceLoader<IQuiz> iq=ServiceLoader.load(IQuiz.class);
		for (IQuiz iQuiz : iq) {
			if(source.equals("jdbc") && iQuiz.getClass().getName().equals("com.dao.impl.jdbc.QuizDao"))
				{
				res=iQuiz;
				break;
				}
			else
				if(source.equals("memory") && iQuiz.getClass().getName().equals("com.dao.impl.memory.QuizDao"))
				{
					res=iQuiz;
					break;
				}
				
		}
		return res;
	}
}
