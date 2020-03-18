package io.github.gabg02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws Exception {
		new App().proceed();
	}

	public void proceed() {
		LOGGER.info("Hello World!");
		TripletOfDice t = new TripletOfDice(16);
		t.rollAllDices();
		System.out.println("1 : "+t.getFirstDie());
		System.out.println("2 : "+t.getSecondDie());
		System.out.println("3 : "+t.getThirdDie());
	}
}
