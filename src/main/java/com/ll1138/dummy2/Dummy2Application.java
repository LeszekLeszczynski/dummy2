package com.ll1138.dummy2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@SpringBootApplication
public class Dummy2Application {

	public static void main(String[] args) {

		SpringApplication.run(Dummy2Application.class, args);

		String p = "";

		for(int i=0; i< 10; i++) {
			p = p + String.valueOf(i);
		}

		for(int i=0; i< 10; i++) {
			p = p + String.valueOf(i);
		}

		System.out.println(p);

	}

}
