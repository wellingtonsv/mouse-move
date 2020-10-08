package br.com.well.mousemove;

public class MouseMoveTask {

	java.awt.Robot robot;

	public MouseMoveTask() {
		changeCursorLocation();
	}

	public void changeCursorLocation() {
		try {
			robot = new java.awt.Robot();
			final int W = 1024;// Dimenssão
			final int H = 768; // 
			for (int x = 0; x < 2; x++) {
				Thread.sleep(60000);
				robot.mouseMove((int) (Math.random() * W), (int) (Math.random() * H));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MouseMoveTask();
	}
}
