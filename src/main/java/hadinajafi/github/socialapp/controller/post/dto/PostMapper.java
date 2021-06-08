package hadinajafi.github.socialapp.controller.post.dto;

import hadinajafi.github.socialapp.persistence.entity.PostEntity;
import org.mapstruct.Mapper;

/**
 * @author Hadi Najafi
 */
@Mapper(componentModel = "spring")
public interface PostMapper {
	PostEntity createPostReqToPostEntity(CreatePostReq req);

	GetPostResponse postEntityToPostResp(PostEntity entity);

	PostEntity updatePostReqToPostEntity(UpdatePostReq req);
}
