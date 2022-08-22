package com.infy.util;

public enum InfyGoConstants {
	
	GENERAL_EXCEPTION_MESSAGE("general.exception");

	private final String type;

	private InfyGoConstants(String type) { this.type = type; }

	@Override
	public String toString() { return this.type; }
}
