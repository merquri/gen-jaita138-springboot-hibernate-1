package com.example.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cliente.cli.CliManager;
import com.example.cliente.db.service.UtenteService;

@SpringBootApplication
public class ClienteApplication implements CommandLineRunner{

	@Autowired
	private UtenteService utenteService;

	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		new CliManager(utenteService);
	}
}
