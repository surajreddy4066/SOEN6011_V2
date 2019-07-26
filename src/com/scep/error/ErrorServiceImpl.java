package com.scep.error;

public class ErrorServiceImpl implements ErrorService{

	@Override
	public Boolean checkFormat(String x, String y) {
		Boolean correctFormat = true;
		for(int j =0;j<x.length(); j++) {

			if(j == 0 && x.charAt(j) == '-') {
				continue;
			}
			
			System.out.println(x.charAt(j));
			if(checkDigit(x.charAt(j)) == false) {
				correctFormat = false;
				break;			
			}
		}

		for(int j =0;j<y.length(); j++) {

			if(j == 0 && y.charAt(j) == '-') {
				continue;
			}
			
			if(checkDigit(y.charAt(j)) == false) {
				correctFormat = false;
				break;			
			}
		}
		
		return correctFormat;
	}

	private Boolean checkDigit(char c) {
		if(!(c > '0' && c < '9')) {
			return false;
		}
		return true;
	}

}
