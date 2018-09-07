package vn.com.knowledge.service;

import java.util.List;

import vn.com.knowledge.common.ObjResponse;

/**
 * @author LocLD1
 *
 * @param <R>
 * @param <T>
 */
public interface SuperService<R, T> {
	R addOrUpdate(R r);

	List<R> findAll();

	R findById(T id);

	ObjResponse deleteById(T id);
}
