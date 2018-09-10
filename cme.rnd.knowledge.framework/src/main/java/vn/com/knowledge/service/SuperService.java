package vn.com.knowledge.service;

import vn.com.knowledge.dto.ResponseModal;

/**
 * @author LocLD1
 *
 * @param <R>
 * @param <T>
 */
public interface SuperService<R, T> {
    ResponseModal add(R r);

    ResponseModal update(R r ,T id);

	ResponseModal findAll();

	ResponseModal findById(T id);

	ResponseModal deleteById(T id);
}
