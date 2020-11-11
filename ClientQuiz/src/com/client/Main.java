/**
 * 
 */
package com.client;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.model.User;
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
	
	public static void main(String[] args) throws IOException {
	
	
		
	
		ManagerQuiz.loaddata();
		
		ManagerQuiz.menu();
		// Quiz q = em.getBuId(1);
		Scanner sc=new Scanner(System.in);
		Integer choix=sc.nextInt();
		Quiz q = null;
				while(choix!=0)
				{
					 q = em.getBuId(choix);
					List<Question> qs = q.getQuestions();
					q.getQuestions().forEach(System.out::println);
					
					for (Question qt : qs) {
						
						System.out.println(qt.getIdq() +  "" +qt.getQuestion());
						qt.getReponses().forEach(x-> System.out.println(x.getIdr()+"---"+ x.getReponse()));
						int choixrep;
						System.out.println("donner votre reponse");
						 choixrep=sc.nextInt();
							Path path=Paths.get("test.txt");
							Files.writeString(path, qt.getIdq()+":"+choixrep+"\n", StandardOpenOption.APPEND);
						 if(choixrep!=0)
							 {
							 	qt.setSelected(true);
							 	
							 	Reponse rp = qt.getReponses().stream()
							 	.filter(x-> x.getIdr()==choixrep).findFirst().get();
							 	rp.setIsselected(true);
							 }
						 //rps.put(qt.getIdq(), choixrep);
					}
					
					 System.out.println("voulez vous tester un autre quiz...");
					 choix=sc.nextInt();
				}
				System.out.println("*************************");
				q.getQuestions().forEach(System.out::println);
				//System.out.println("question sans reponse.........!");
				//q.getQuestions().stream().filter(x -> !x.isSelected()).collect(Collectors.toList()).forEach(System.out::println);
				;
				
//				 Map<String, Long> res = q.getQuestions().stream().collect(Collectors.groupingBy(Question::getType, Collectors.counting()));
//				res.forEach((x,y)-> System.out.println(x+" : "+y));
				
				Map<Boolean, List<Question>> res = q.getQuestions().stream().collect(Collectors.groupingBy(Question::isSelected));
				
				//regroupement par response juste et fausse
				
				
				
				
				//Supplier<Tuple> pp= x-> new Tuple(Reponse::isIstrue, Reponse::isIsselected);
				
//				 q.getQuestions().get(0).getReponses()
//				 .stream().collect(Collectors.groupingBy(Reponse::isIstrue, pp, Collectors.toList()));
				 
				//aa.entrySet().stream().forEach(t-> System.out.println(t.getKey()+"---"+t.getValue().size()));
				
				
				boolean bonnreponse = q.getQuestions().get(0).getReponses().stream().allMatch(x-> x.isIsselected() == x.isIstrue());
				boolean questionselected = q.getQuestions().get(0).getReponses().stream().anyMatch(x-> x.isIsselected());
				 
	}

}
