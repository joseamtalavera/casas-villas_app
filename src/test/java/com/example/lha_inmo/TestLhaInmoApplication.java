package com.example.lha_inmo;

import org.springframework.boot.SpringApplication;

import es.lhainmobiliaria.lha_inmo.LhaInmoApplication;

public class TestLhaInmoApplication {

	public static void main(String[] args) {
		SpringApplication.from(LhaInmoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
