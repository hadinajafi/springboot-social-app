package hadinajafi.github.socialapp.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * @author Hadi Najafi
 */

@MappedSuperclass
@Getter
@Setter
public class Entity {
	@Id
	protected UUID id;
	protected Timestamp createdTime;
	protected Timestamp updatedTime;
	private Boolean deleted;
	private String deleteToken;

	@PrePersist
	public void prePersist() {
		setCreatedTime(new Timestamp(System.currentTimeMillis()));
		setUpdatedTime(new Timestamp(System.currentTimeMillis()));
		setDeleted(false);
		setDeleteToken("");
		if (id == null)
			id = UUID.randomUUID();
	}

	@PreUpdate
	public void preUpdate() {
		setUpdatedTime(new Timestamp(System.currentTimeMillis()));
		if (id == null)
			id = UUID.randomUUID();
	}
}
