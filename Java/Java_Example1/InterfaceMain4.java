package com.ust.examples;

abstract interface MusicPlayer {
	public static final int defaultVolume = 30;
	public abstract void play();
	public abstract void stop();
}

class Player implements MusicPlayer {
	public void play() {
		System.out.println("Started");
	}
	public void stop() {
		System.out.println("Stoped");
	}
}
public class InterfaceMain4 {
	
	public static void main(String[] args) {
		Player ply = new Player();
		ply.play();
		ply.stop();
	}

}
