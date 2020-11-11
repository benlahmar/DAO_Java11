import com.quiz.service.IQuizservice;

module app.clientquiz {
	requires app.module1;
	requires app.quiz.services;
	requires app.moduleuser;
	requires java.net.http;

	uses IQuizservice;
}