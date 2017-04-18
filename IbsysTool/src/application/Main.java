package application;

import generated.Input;
import generated.Results;

import java.io.InputStream;

import javax.xml.bind.JAXB;

public class Main {

	public static void main(String[] args) {
		InputStream inputData = Main.class.getResourceAsStream("input.xml");
		Input input = JAXB.unmarshal(inputData, Input.class);
		System.out.println(input);
		InputStream resultData = Main.class.getResourceAsStream("input.xml");
		Results results = JAXB.unmarshal(resultData, Results.class);
		System.out.println(results.toString());
	}
}
