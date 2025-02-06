package com.dp.creational_pattern.factory_method_pattern.demo_02;

import java.io.IOException;

public class FactoryMethodPatternDemo {
	public static void main(String[] args) throws IOException {
		
		GetPlanFactory planFactory = new GetPlanFactory();
		Plan domesticPlan = planFactory.getPlan("DOMESTICPLAN");
		System.out.print("Bill amount for Domestic Plan for 100 units is : ");
		domesticPlan.setRate();
		domesticPlan.calculateBill(100);
		
		Plan commercialPlan = planFactory.getPlan("COMMERCIALPLAN");
		System.out.print("Bill amount for Commercial Plan for 150 units is : ");
		commercialPlan.setRate();
		commercialPlan.calculateBill(150);
		
		Plan institutionalPlan = planFactory.getPlan("INSTITUTIONALPLAN");
		System.out.print("Bill amount for Institutional Plan for 125 units is : ");
		institutionalPlan.setRate();
		institutionalPlan.calculateBill(125);
		
	}
}
