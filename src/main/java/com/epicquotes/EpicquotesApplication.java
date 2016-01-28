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
    qService.addQuote(new Quote("¿A dónde vas? ¡Patatas traigo!", "Ortega y Pachecho"));
    qService.addQuote(new Quote("Como te caigas, además de caerte, te voy a pegar yo.", "Una abuela"));
    qService.addQuote(new Quote("All those moments will be lost in time… like tears in rain.", "Roy Batty/Rutger Hauer in Blade Runner (1982)"));
    qService.addQuote(new Quote("Carpe diem. Seize the day, boys. Make your lives extraordinary.", "John Keating/Robin Williams in Dead Poets Society (1989)"));
    qService.addQuote(new Quote("Did you think I'd be too stupid to know what a eugoogly is?", "Derek Zoolander/Ben Stiller in Zoolander"));
    qService.addQuote(new Quote("Do I look like I give a damn?", "James Bond (Daniel Craig) in Casino Royale (2006)"));
    qService.addQuote(new Quote("Do I look like someone who cares what God thinks?", "Doug Bradley/Pinhead in Hellraiser (1983)"));
    qService.addQuote(new Quote("ET phone home.", "Gertie/Drew Barrymore in ET the Extra-terrestrial (1982)"));
    qService.addQuote(new Quote("Everybody runs, Fletch.", "John Anderton/Tom Cruise, Minority Report (2002)"));

  }

  public static void main(String[] args) {
    SpringApplication.run(EpicquotesApplication.class, args);
  }

}
