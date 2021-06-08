package hadinajafi.github.socialapp.controller.post.dto;

import hadinajafi.github.socialapp.persistence.entity.PostEntity;
import org.mapstruct.*;
/**
 * @author Hadi Najafi
 */
@Mapper(componentModel = "spring")
public interface PostMapper {
	PostEntity cratePostReqToPostEntity (CreatePostReq req);

	GetPostResponse postEntityToPostResp (PostEntity entity);
}
