package com.example;

public class ThreadDump {
	public static void main(String[] args) {
		new ThreadDump().process();
	}

	private void process() {
		for (int i = 0; i < 5; i++) {
			MyThread t = new MyThread();
			t.setName("my-thread-" + i);
			t.setTime(30);
			t.start();
		}
		System.out.println("main end");
	}
}

class MyThread extends Thread {
	private int time;

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public void run() {
		try {
			sleep(time * 1000);
			System.out.println(this.getName());
		} catch (InterruptedException e) {
		}
	}
}
