package com.dp.structural_design_pattern.flyweight_pattern;

import java.util.HashMap;


// FlyWeight class
class BulletType {
	private String color; // Intrinsic property shared by all bullets
	
	public BulletType(String color) {
		this.color = color;
		System.out.println("Created BulletType with color " + color);
	}
}


class Bullet {
	private BulletType type; // Intrinsic property shared by all bullets
	private int x, y; // Extrinsic property unique to each bullet
	private int velocity; // Extrinsic property unique to each bullet
	
	public Bullet(String color, int x, int y, int velocity) {
		this.type = BulletTypeFactory.getBulletType(color); // Intrinsic property shared by all bullets
		this.x = x; // Extrinsic property unique to each bullet
		this.y = y; // Extrinsic property unique to each bullet
		this.velocity = velocity; // Extrinsic property unique to each bullet
		System.out.println("Creating bullet at (" + x + ", " + y + ") with velocity " + velocity);
	}
	
	public void display() {
		System.out.println("Bullet at (" + x + ", " + y + ") moving at velocity " + velocity);
	}
}


class BulletTypeFactory {
	private static final HashMap<String, BulletType> bulletTypes = new HashMap<>();
	
	public static BulletType getBulletType(String color) {
		if(!bulletTypes.containsKey(color)) {
			bulletTypes.put(color, new BulletType(color));
		}
		return bulletTypes.get(color);
	}
}


public class Demo1 {
	public static void main(String[] args) {
		// 5 Red Bullet Objects
		for(int i = 0 ; i < 5 ; i++) {
			Bullet bullet = new Bullet("Red", i * 10, i * 12, 5);
		}
		// 5 Green Bullet Objects
		for(int i = 0 ; i < 5 ; i++) {
			Bullet bullet = new Bullet("Green", i * 10, i * 12, 5);
		}
	}
}

