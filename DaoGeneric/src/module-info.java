import com.dao.impl.jdbc.UserDao;
import com.dao.impl.memory.QuizDao;
import com.dao.model.IQuiz;
import com.dao.model.IUser;

module dao.modulegenerique {
	exports com.dao;
	exports com.dao.impl.jdbc;
	exports com.dao.impl.memory;
	exports com.dao.model;

	requires transitive app.module1 ;
	requires transitive app.moduleuser;
	
	provides IQuiz with QuizDao, com.dao.impl.jdbc.QuizDao;
	provides IUser with UserDao, com.dao.impl.memory.UserDao;
}