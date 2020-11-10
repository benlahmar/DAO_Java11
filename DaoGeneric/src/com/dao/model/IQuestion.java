/**
 * 
 */
package com.dao.model;

import com.dao.IDao;
import com.moi.Question;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public interface IQuestion extends IDao<Question, Integer>{

	public void addQuestion2Quiz(Question q, int idquiz);
}
