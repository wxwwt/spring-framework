package org.springframework.mock;

/**
 * @author shenchuang
 * @date 2022/1/13 11:01 PM
 */
public class Robot2 {

	private Robot1 robot1;

	public Robot1 getRobot1() {
		return robot1;
	}

	public void setRobot1(Robot1 robot1) {
		this.robot1 = robot1;
	}

	public void say() {
		System.out.println("I`m robot2");
	}
}
