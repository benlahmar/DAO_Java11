/**
 * 
 */
package com.client;


import java.time.LocalDateTime;
import java.util.Scanner;

import com.moi.Question;
import com.moi.Quiz;
import com.moi.Reponse;
import com.quiz.service.QuizServiceImpl;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class Main {

	/**
	 * @param args
	 */
	static ManagerQuiz em=new ManagerQuiz();
	
	public static void main(String[] args) {
		
		
		ManagerQuiz.loaddata();
		ManagerQuiz.menu();
		
		Scanner sc=new Scanner(System.in);
		Integer choix=sc.nextInt();
				while(choix!=0)
				{
					Quiz q = em.getBuId(choix);
					q.getQuestions().forEach(x-> System.out.println(x.getQuestion()));
					
					System.out.println("donner votre reponse");
					 choix=sc.nextInt();
					
				}
		
	}

}
