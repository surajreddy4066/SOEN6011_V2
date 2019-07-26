package com.scep.service;

public class PowerService implements Service {

	@Override
	public <T extends Number> Double power(T xtemp, T ytemp) {
		// TODO Auto-generated method stub	
		Boolean negativeFlag = false;
		Double x = xtemp.doubleValue();
		Double y = ytemp.doubleValue();	

		if (y < 0){
			negativeFlag = true;
		}

		if(negativeFlag) {
			return 1 / calculate(x*-1, y * -1);
		} else {
			return calculate(x, y);
		}


	}

	private Double calculate (Double x, Double y){
		if (y == 0){
			return 1.0;
		} else if (y % 2 == 0){
			return calculate(x, y/2) * calculate(x, y/2);
		} else {
			return x * calculate(x, y-1);
		}
	}

}
