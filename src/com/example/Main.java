package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	List<Person> persons;
	
	public Main() {
		persons = new ArrayList<>();
		persons.add(new Person("Homer", 38, "Male"));
		persons.add(new Person("Bart", 10, "Male"));
		persons.add(new Person("Abbe", 78, "Male"));
		
		persons.add(new Person("Marge", 32, "Female"));
		persons.add(new Person("Maggie", 1, "Female"));
		persons.add(new Person("Lisa", 8, "Female"));
	}
	
	public static void main(String[] args) {
		
		Main app = new Main();
		List<String> names = app.persons.stream().map(p -> p.getName()).collect(Collectors.toList());
		names.stream().forEachOrdered(System.out::println);
	}

}
