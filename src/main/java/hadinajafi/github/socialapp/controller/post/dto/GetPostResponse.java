package hadinajafi.github.socialapp.controller.post.dto;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Hadi Najafi
 */

@Data
public class GetPostResponse {
	private String title;
	private String body;
	private Timestamp createdTime;
	private Timestamp updatedTime;
	private Boolean deleted;
}
