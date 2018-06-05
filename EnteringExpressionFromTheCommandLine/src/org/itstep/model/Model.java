package org.itstep.model;

import java.util.Scanner;

public class Model {

	private String word1;
	private String word2;

	public String getWord2() {
		return word2;
	}

	public void setWord2(String word2) {
		this.word2 = word2;
	}

	public String getWord1() {
		return word1;
	}

	public void setWord1(String word1) {
		this.word1 = word1;
	}

	public Model(String word1, String word2) {
		super();
		this.word1 = word1;
		this.word2 = word2;
	}

	public Model() {
		super();
	}

	public String inputWordByScaner1(Scanner scaner) {
		String sc = scaner.next();
		if (sc.equals("Hello")) {
			word1 = sc;
			return sc;
		} else {
			return null;
		}
	}

	public String inputWordByScaner2(Scanner scaner) {
		String sc = scaner.next();
		if (sc.equals("world")) {
			word2 = sc;
			return sc;
		} else {
			return null;
		}
	}

	public String writeSentence(String word1, String word2) {
		return word1 + " " + word2;
	}

}
