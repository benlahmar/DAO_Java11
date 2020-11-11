/**
 * 
 */
package com.client;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.model.User;
import com.moi.Question;
import com.moi.Quiz;
import com.moi.Reponse;
import com.quiz.service.IQuizservice;
import com.quiz.service.QuizServiceImpl;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class ManagerQuiz implements IManager{

	//static QuizServiceImpl qm=new QuizServiceImpl("memory");
	
	static IQuizservice qm;
	
	
	public ManagerQuiz() {
		super();
		
		ServiceLoader<IQuizservice> ss=ServiceLoader.load(IQuizservice.class);
		qm=ss.findFirst().get();
	}

	
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
			for(int j=1;j<5;j++)
			{
				Question qs=new Question();
				qs.setIdq(j);
				qs.setQuestion("question   "+j);
				if(j%2==0)
				qs.setType("simple");
				else
					qs.setType("multiple");
					
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


	@Override
	public Set<User> users() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Question> notresponse(Quiz q) {
		return q.getQuestions().stream().filter(x -> !x.isSelected()).collect(Collectors.toList());
		 
	}


	@Override
	public int score(Quiz q, int idu) {
		
	 q.getQuestions().stream()
				.map(x -> x.getReponses().stream().filter(r-> r.isIsselected() && r.isIstrue()).collect(Collectors.toList()));
	 List<Question> qs = q.getQuestions();
	
	 int score=0;
	 for (Question qt : qs) {
		long c=qt.getReponses().stream().filter(r-> r.isIsselected() && r.isIstrue()).count();
		score+=c;
	}
	long rr = qs.stream().flatMap(x ->x.getReponses().stream().filter(r-> r.isIsselected() && r.isIstrue())).count();
	 
		return score;
	}
	
}
