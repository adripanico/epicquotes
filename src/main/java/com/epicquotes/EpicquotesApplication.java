package com.epicquotes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EpicquotesApplication implements CommandLineRunner{

  Logger logger = LoggerFactory.getLogger(EpicquotesApplication.class);

  @Autowired
  QuoteService qService;

  public void run(String... args) {
    if (qService.addQuote(new Quote("¿A dónde vas? ¡Patatas traigo!", "Ortega y Pachecho")) > 0){
      logger.info("Quote saved successfully");
    }
    if (qService.addQuote(new Quote("Como te caigas, además de caerte, te voy a pegar yo.", "Una abuela")) > 0) {
    	logger.info("Alright!");
    }
    logger.info(qService.getRandomQuote().toString());

  }

  public static void main(String[] args) {
    SpringApplication.run(EpicquotesApplication.class, args);
  }

}
