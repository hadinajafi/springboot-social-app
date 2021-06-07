package hadinajafi.github.socialapp.persistence.service.base;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hadi Najafi
 */

@Getter
@Setter
@NoArgsConstructor
public class SearchCriteria<C extends Criteria> {
	protected Integer start = 0;
	protected Integer size = 50;
	protected C criteria;
	protected List<SortBy> sorts = new ArrayList<>();

	@NoArgsConstructor
	public static class SortBy {
		@Getter
		private String fieldName;
		@Getter
		private Sort.Direction direction;

		public SortBy(String fieldName, Sort.Direction direction) {
			this.fieldName = fieldName;
			this.direction = direction;
		}

		public enum FieldName {
			createdTime,
			updatedTime,
		}
	}
}
