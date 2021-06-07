package hadinajafi.github.socialapp.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

/**
 * @author Hadi Najafi
 */

@javax.persistence.Entity
@Setter
@Getter
public class PostEntity extends Entity {
	@Column(length = 50)
	private String title;
	private String body;
}
