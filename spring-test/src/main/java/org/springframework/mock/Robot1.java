package org.springframework.mock;

/**
 * @author shenchuang
 * @date 2022/1/13 11:01 PM
 */
public class Robot1 {

	private Robot2 robot2;

	public Robot2 getRobot2() {
		return robot2;
	}

	public void setRobot2(Robot2 robot2) {
		this.robot2 = robot2;
	}

	public void say() {
		System.out.println("I`m robot1");
	}
}
