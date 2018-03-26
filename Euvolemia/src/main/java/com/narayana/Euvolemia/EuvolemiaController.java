package com.narayana.Euvolemia;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EuvolemiaController {
	
	protected Logger logger = Logger
			.getLogger(EuvolemiaController.class.getName());
	
	@Autowired
	EuvolemiaRepository euvolemiaRepository;
	
	@RequestMapping("/Euvolemia/{euvolemicSymptoms}")
	public String Euvolemia(@PathVariable("euvolemicSymptoms") String euvolemicSymptoms) {
		logger.info("accounts-changed byId() invoked: " + euvolemicSymptoms);
		String retVal = euvolemiaRepository.geteuvolmia(euvolemicSymptoms);
		logger.info("accounts-microservice byId() found: " + retVal);
		return retVal;
	}

}
