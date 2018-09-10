package com.zhoulesin.modifiertype;

public class VolatileTest {
	public static void main(String[] args) {
		Task task = new Task();
		new Thread(new Runnable() {

			@Override
			public void run() {
				task.run();
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				task.stop();
			}
		}).start();
	}

	public static class Task {

//		public boolean active;
		public volatile boolean active;

		public void run() {
			System.out.println("run");
			active = true;
			while (active) {
				System.out.println("aaaa");
			}
		}

		public void stop() {
			System.out.println("stop");
			active = false;
		}
	}
}
