package org.itstep;

import java.util.Scanner;

import org.itstep.controller.Controller;
import org.itstep.model.Model;
import org.itstep.view.View;

public class AppRunner {

	public static void main(String[] args) {
		
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(view, model);
		
		controller.enteringSentence();;
		

	}

}
