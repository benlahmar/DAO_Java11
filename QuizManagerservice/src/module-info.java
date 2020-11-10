import com.dao.model.IQuiz;
import com.quiz.service.IQuizservice;
import com.quiz.service.QuizServiceImpl;


module app.quiz.services {
	
	requires dao.modulegenerique;
	requires transitive app.module1;
	requires transitive app.moduleuser;
	exports com.quiz.service;
	provides IQuizservice with QuizServiceImpl;
	
	uses IQuiz;
	
}