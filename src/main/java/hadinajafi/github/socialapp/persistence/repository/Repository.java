package hadinajafi.github.socialapp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;
import java.util.UUID;

/**
 * @author Hadi Najafi
 */

public interface Repository<E> extends JpaRepository<E, UUID>, JpaSpecificationExecutor<E> {
	Optional<E> findByIdAndDeleted(UUID id, boolean deleted);
}
