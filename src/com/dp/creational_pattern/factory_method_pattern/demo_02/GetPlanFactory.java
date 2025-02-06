package com.dp.creational_pattern.factory_method_pattern.demo_02;

public class GetPlanFactory {
	
	public Plan getPlan(String planType) {
		if(planType == null) {
			return null;
		}
		if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}
		if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		}
		if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")){
			return new InstitutionalPlan();
		}
		return null;
	}
	
}
