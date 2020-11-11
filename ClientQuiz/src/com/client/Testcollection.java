package com.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.moi.Question;
import com.moi.Quiz;

public class Testcollection {

	public static void main(String[] args) {
		IFquiz simple= q->{
			List<Question> rs=new ArrayList<Question>();
			List<Question> qs = q.getQuestions();
			for (Question  x : qs) {
				if(x.getType().equals("simple"))
					rs.add(x);
			}
			return rs;
		};
		 
		IFquiz multiple= q->{
			List<Question> rs=new ArrayList<Question>();
			List<Question> qs = q.getQuestions();
			for (Question  x : qs) {
				if(x.getType().equals("multiple"))
					rs.add(x);
			}
			return rs;
		};
		 
		
		Quiz q = null;
		List<Question> ls = simple.getx(q);
		List<Question> lsm = multiple.getx(q);
		
		
		Function<Quiz, List<Question>> simple2= qt->{
			List<Question> rs=new ArrayList<Question>();
			List<Question> qs = qt.getQuestions();
			for (Question  x : qs) {
				if(x.getType().equals("simple"))
					rs.add(x);
			}
			return rs;
		};
		
		Function<Quiz, List<Question>> multiple2= qt->{
			List<Question> rs=new ArrayList<Question>();
			List<Question> qs = qt.getQuestions();
			for (Question  x : qs) {
				if(x.getType().equals("multiple"))
					rs.add(x);
			}
			return rs;
		};
		
		
		List<Question> lss = simple2.apply(q);
		
		multiple2.apply(q);
		
		
		
	}

}
