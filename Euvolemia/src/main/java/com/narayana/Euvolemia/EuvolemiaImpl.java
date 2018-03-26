package com.narayana.Euvolemia;

import org.springframework.stereotype.Repository;

@Repository
public class EuvolemiaImpl implements EuvolemiaRepository {

	@Override
	public String geteuvolmia(String euvolemicSymptoms) {
		if(Integer.parseInt(euvolemicSymptoms)==1) {
			return "euvolemia";
		
		}
		else {
			
			return "notEuvolemia";
		}
	}

}
