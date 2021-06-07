package hadinajafi.github.socialapp.persistence.service.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Hadi Najafi
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Criteria {
	private Long minCreatedTime;
	private Long maxCreatedTime;
}
