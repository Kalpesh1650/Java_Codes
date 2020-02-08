package com.java.designPatterns;

import java.util.*;

//This is a demonstration of Singleton pattern in java
public class SingletonPattern {

	private static final SingletonPattern INSTANCE // store one instance
			= new SingletonPattern(); // (this is the singleton)
	private Set<String> availableSeats;

	public static SingletonPattern getInstance() { // callers can get to
		return INSTANCE; // the instance
	}

	private SingletonPattern() { // callers can't create
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1A");
	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}

	public static void main(String[] args) {
		ticketAgentBooks("1A");
		ticketAgentBooks("1A");
	}
	
	private static void ticketAgentBooks(String seat) {
		SingletonPattern show = SingletonPattern.getInstance();
		System.out.println(show.bookSeat(seat));
	}
	
}
