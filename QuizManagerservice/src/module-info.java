import com.dao.model.IQuiz;

module app.quiz.services {
	
	requires dao.modulegenerique;
	requires app.module1;
	requires app.moduleuser;
	exports com.quiz.service;
	uses IQuiz;
	
}