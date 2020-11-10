/**
 * 
 */
package com.client;

import java.time.LocalDateTime;

import com.moi.Question;
import com.moi.Quiz;
import com.moi.Reponse;
import com.quiz.service.QuizServiceImpl;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class ManagerQuiz implements IManager{

	static QuizServiceImpl qm=new QuizServiceImpl("memory");
	
	
	@Override
	public void passerquiz(int idquiz) {
		
		
	}

	
	public static void menu()
	{
		
		qm.allquiz().forEach(x -> {
			System.out.println("Quiz numéro "+x.getId() +". "+x.getTitle());
			
		});
		System.out.println("Choisir quiz");
	}
	
	public static  void loaddata()
	{
		for(int i=1;i<5;i++)
		{
			Quiz q=new Quiz();
			q.setId(i);
			q.setTitle("title "+i);
			q.setDate(LocalDateTime.now());
			q.setDescription("description  "+i);
			for(int j=1;j<10;j++)
			{
				Question qs=new Question();
				qs.setIdq(j);
				qs.setQuestion("question   "+j);
				qs.setType("simple");
				for(int k=1;k<4;k++)
				{
					Reponse r=new Reponse();
					r.setIdr(k);
					r.setReponse("reponse "+k);
					if(k==1)
					r.setIstrue(true);
					else
						r.setIstrue(false);
					
					qs.getReponses().add(r);
				}
				q.getQuestions().add(qs);
				
			}
			qm.addquiz(q);
		}
		
		qm.allquiz().forEach(x -> System.out.println(x.toString()));
		
	}


	
	@Override
	public Quiz getBuId(int id) {
		
		return qm.findById(id);
	}
	
}
