package org.itstep.controller;

import java.util.Scanner;

import org.itstep.model.Model;
import org.itstep.view.View;

public class Controller {

	View view;
	Model model;

	public Controller(View view, Model model) {
		super();
		this.view = view;
		this.model = model;
	}

	public Controller() {
		super();
	}

	public void enteringSentence() {
		Scanner scaner = new Scanner(System.in);
		while (model.getWord1() == null) {
			view.printMesage(view.INPUT_SENTENSE_HELLO);
			if (model.inputWordByScaner1(scaner) != null) {
				view.printMesageAndWord(view.OUR_WORD, model.getWord1());
			} else {
				view.printMesage(view.WRONG_INPUT);
			}
		}
		while (model.getWord2() == null) {
			view.printMesage(view.INPUT_SENTENSE_WORLD);
			if (model.inputWordByScaner2(scaner) != null) {
				view.printMesageAndWord(view.OUR_WORD, model.getWord2());
			} else {
				view.printMesage(view.WRONG_INPUT);
			}
		}
		view.printMesageAndWord(view.OUR_SENTENCE, model.writeSentence(model.getWord1(), model.getWord2()));
	}
}
