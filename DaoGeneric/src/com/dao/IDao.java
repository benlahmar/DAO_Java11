/**
 * 
 */
package com.dao;

import java.util.List;

/**
 * @author BEN LAHMAR EL HABIB
 * @param <T>
 * @param <K>
 *
 */
public interface IDao<T, K> {

	public T save(T t);
	public T findById(K k);
	public List<T> findAll();
	public T update(K k, T t);
	
	
}
