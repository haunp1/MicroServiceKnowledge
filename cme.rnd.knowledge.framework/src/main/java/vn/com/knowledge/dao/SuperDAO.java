package vn.com.knowledge.dao;

import java.util.List;
import java.util.Optional;

public interface SuperDAO<R, T> {
	public R addOrUpdate(R r);

	public List<R> findAll();

	void deleteById(T t);

	Optional<R> findById(T t);
}
