package org.innovate.samplemicroservice.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BChekuri
 *
 */
@RestController
@RequestMapping("/info")
public class ApplicationInfoController {
	
	private final Logger log = LoggerFactory.getLogger(ApplicationInfoController.class);
	
	@Autowired
	BuildProperties buildProperties;
	
	@GetMapping(value = "/version")
	public String getVersion() {
		log.info("getVersion");
		return buildProperties.getVersion();
	}

}
