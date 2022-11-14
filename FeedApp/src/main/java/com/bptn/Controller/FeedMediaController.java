package com.bptn.Controller;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bptn.exceptions.InvalidImageMetaDataException;
import com.bptn.models.ImageMetaData;
import com.bptn.request.FeedMediaRequest;
import com.bptn.service.FeedMediaService;
@Controller
public class FeedMediaController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FeedMediaService feedMediaService;
	
	
	@GetMapping(value = "/image/metadata/{postKey}")
	public ResponseEntity<Object> getImageMediaByPostKey(@PathVariable("postKey") String postKey) {
		
		LOGGER.debug("Executing getImageMediaByPostKey API ");
		
		List<ImageMetaData> imageMetaDataList;
		
		try {
			imageMetaDataList = feedMediaService.getImageMediaByPostKey(postKey);
		} catch (InvalidImageMetaDataException e) {
			LOGGER.error("Unable to find image MetaData by postKey, cause={},", e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
		return new ResponseEntity<>(imageMetaDataList, HttpStatus.OK);
	}
	
	@GetMapping(value = "/imageinfo/metadata/{imageID}")
	public ResponseEntity<Object> getPostsImageMediaByImageId(@PathVariable("imageID") String imageID) {
		
		LOGGER.debug("Executing get getPostsImageMediaByImageId API");
		
		ImageMetaData imageMetaData;
		
		try {
			imageMetaData = feedMediaService.getPostsImageMediaByImageId(imageID);
		} catch (InvalidImageMetaDataException e) {
			LOGGER.error("Unable to find image MetaData by imageID, cause={},", e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		return new ResponseEntity<>(imageMetaData, HttpStatus.OK);
	}
	
	@PostMapping(value = "/image/metadata", consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> createNewImage(@RequestBody FeedMediaRequest feedMediaRequest) {
		
		LOGGER.debug("Executing createNewImage API");
		ImageMetaData imageMetaData = feedMediaService.createNewImage(feedMediaRequest);
		return new ResponseEntity<>(imageMetaData, HttpStatus.OK);
	}
}