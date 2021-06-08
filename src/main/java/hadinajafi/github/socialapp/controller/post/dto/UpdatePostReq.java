package hadinajafi.github.socialapp.controller.post.dto;

import lombok.Data;

import java.util.UUID;

/**
 * @author Hadi Najafi
 */

@Data
public class UpdatePostReq {
	private UUID id;
	private String title;
	private String body;
}
