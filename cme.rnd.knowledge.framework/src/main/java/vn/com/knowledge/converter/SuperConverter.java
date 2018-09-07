package vn.com.knowledge.converter;

import java.util.List;

public interface SuperConverter<D, E> {
	List<D> convertEntitiesToDTOs(final List<E> entities);

	List<E> convertDTOsToEntities(final List<D> dtos);

	D convertToDTO(final E entity);

	E convertToEntity(final D dto);
}