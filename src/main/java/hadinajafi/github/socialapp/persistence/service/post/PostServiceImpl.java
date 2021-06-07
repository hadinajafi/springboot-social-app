package hadinajafi.github.socialapp.persistence.service.post;

import hadinajafi.github.socialapp.persistence.entity.PostEntity;
import hadinajafi.github.socialapp.persistence.repository.Repository;
import hadinajafi.github.socialapp.persistence.repository.PostRepository;
import hadinajafi.github.socialapp.persistence.service.base.CrudServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Hadi Najafi
 */

@Service
@RequiredArgsConstructor
@Transactional
public class PostServiceImpl extends CrudServiceImpl<PostEntity, PostCriteria> implements PostService {
	private final PostRepository repository;

	@Override
	public Repository<PostEntity> getRepository() {
		return repository;
	}

	@Override
	protected void updateFields(PostEntity foundedInDb, PostEntity entity) {
		//todo: complete this
	}
}
