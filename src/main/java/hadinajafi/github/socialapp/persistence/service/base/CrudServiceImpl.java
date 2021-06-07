package hadinajafi.github.socialapp.persistence.service.base;

import hadinajafi.github.socialapp.persistence.entity.Entity;
import hadinajafi.github.socialapp.persistence.repository.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

/**
 * @author Hadi Najafi
 */

public abstract class CrudServiceImpl<E extends Entity, C extends Criteria> implements CrudService<E, C> {
	@Override
	public E update(E entity) {
		var loadedFromDb = this.fetch(entity.getId());
		updateFields(loadedFromDb,entity);
		loadedFromDb.setUpdatedTime(new Timestamp(System.currentTimeMillis()));
		return getRepository().save(loadedFromDb);
	}

	@Override
	public E create(E entity) {
		entity.setCreatedTime(new Timestamp(System.currentTimeMillis()));
		entity.setUpdatedTime(new Timestamp(System.currentTimeMillis()));
		if (entity.getId() == null)
			entity.setId(UUID.randomUUID());
		return getRepository().save(entity);
	}

	@Override
	public E delete(E entity) {
		return null;
	}

	@Override
	public E fetch(UUID id) {
		if (id == null)
			return null; //todo: return custom not found error
		var optional = getRepository().findByIdAndDeleted(id, false);
		if (optional.isEmpty())
			return null;//todo: return custom not found error
		return optional.get();
	}

	@Override
	public List<E> search(SearchCriteria<C> criteria) {
		return null;
	}

	protected abstract Repository<E> getRepository();

	protected abstract void updateFields(E foundedInDb, E entity);
}
