package hadinajafi.github.socialapp.controller.post;

import hadinajafi.github.socialapp.controller.post.dto.CreatePostReq;
import hadinajafi.github.socialapp.controller.post.dto.GetPostResponse;
import hadinajafi.github.socialapp.controller.post.dto.PostMapper;
import hadinajafi.github.socialapp.persistence.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static hadinajafi.github.socialapp.common.PathConstants.POST_BASE_URL;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @author Hadi Najafi
 */

@RestController
@RequestMapping(path = POST_BASE_URL, produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PostController {
	final private PostService service;
	final private PostMapper mapper;

	@PostMapping(consumes = APPLICATION_JSON_VALUE)
	@ResponseStatus(CREATED)
	public GetPostResponse create(@RequestBody final CreatePostReq req) {
		//todo: add validation
		var entity = mapper.cratePostReqToPostEntity(req);
		return mapper.postEntityToPostResp(service.create(entity));
	}

	@GetMapping("/{id}")
	public GetPostResponse getSpecificPost(@PathVariable String id) {
		//todo: add validation
		return mapper.postEntityToPostResp(service.fetch(UUID.fromString(id)));
	}
}
