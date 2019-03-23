package org.innovate.samplemicroservice.web;


import org.innovate.samplemicroservice.model.ApplicationDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class SampleController {
	
	private final Logger log = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping(value = "test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ApplicationDTO> testMessage(@RequestParam(required = true) String message) {
		log.info("testMessage");
		return new ResponseEntity<ApplicationDTO>(new ApplicationDTO(message), HttpStatus.OK);
	}

}
