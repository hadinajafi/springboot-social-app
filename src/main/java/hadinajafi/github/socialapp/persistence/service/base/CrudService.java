package hadinajafi.github.socialapp.persistence.service.base;

import java.util.List;
import java.util.UUID;

/**
 * @author Hadi Najafi
 */

public interface CrudService<E, C extends Criteria> {
	E update(E e);

	E create(E e);

	E delete(E e);

	E fetch(UUID id);

	List<E> search(SearchCriteria<C> criteria);
}
