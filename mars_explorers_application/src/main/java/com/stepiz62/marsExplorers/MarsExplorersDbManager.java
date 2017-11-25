package com.stepiz62.marsExplorers;

import org.joty.access.DbManager;

public class MarsExplorersDbManager extends DbManager {

	@Override
	public boolean dbExceptionCheck(String textToInspect, String code, ExcCheckType exceptionCheckType) {
		boolean retVal = false;
		switch (exceptionCheckType) {
			case INVALID_CREDENTIALS:
				if (textToInspect.indexOf("Access denied for user") >= 0)
					retVal = true;
				break;
			case CONSTR_VIOLATION_ON_DELETE:
				if (textToInspect.indexOf("Cannot delete or update a parent row") >= 0)
					retVal = true;
				break;
		}

		return retVal;
	}

}
