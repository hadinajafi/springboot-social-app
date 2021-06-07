package hadinajafi.github.socialapp.persistence.service.post;

import hadinajafi.github.socialapp.persistence.service.base.Criteria;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Hadi Najafi
 */
@Getter
@Setter
@NoArgsConstructor
public class PostCriteria extends Criteria {
	private String textLike;
}
