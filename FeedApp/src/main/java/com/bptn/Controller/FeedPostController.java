package com.bptn.Controller;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bptn.exceptions.InvalidRequestException;
import com.bptn.models.Post;
import com.bptn.request.FeedPostRequest;
import com.bptn.service.FeedPostService;
import com.bptn.service.UserService;
@Controller
public class FeedPostController {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FeedPostService feedPostService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/Posts", consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE}) //cosumes get infor in json format
	
	public ResponseEntity<Object> saveFeed(@RequestBody FeedPostRequest feedPostRequest ){
	LOGGER.debug("Execute saceFeed Api {}");
	
	try {
		validateRequest(feedPostRequest);
		userService.validateUserId(feedPostRequest.getUserName());
		Post feed = feedPostService.getPostFromNewsAndSavePost(feedPostRequest);
		
		return new ResponseEntity<>(feed,HttpStatus.OK);
	}
	catch(Exception exception ){
		LOGGER.error("Unable to save feed, cause ={}", exception.getMessage());
		return ResponseEntity.badRequest().body(exception.getMessage());
	}
	
}
	private void validateRequest(FeedPostRequest feedPostRequest) throws InvalidRequestException {
		LOGGER.debug("Execute saceFeed Api {}");
		
		if(StringUtils.isEmpty(feedPostRequest.getFromDate()) && StringUtils.isEmpty(feedPostRequest.getToDate())) {
			throw new InvalidRequestException ("Invalid request:From Data or To Data is required");
			
		}
		
	}
}