package com.epicquotes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public int addQuote(Quote quote){
    String sql = "INSERT INTO quote(content, author) VALUES(?,?)";
    return jdbcTemplate.update(sql, quote.getContent(), quote.getAuthor());
  }

  public Quote getRandomQuote(){
    List<Quote> quotes = jdbcTemplate.query("SELECT * FROM quote", new RowMapper<Quote>(){
      public Quote mapRow(ResultSet rs, int arg1) throws SQLException {
    	Quote q = new Quote();
        q.setContent(rs.getString("content"));
        q.setAuthor(rs.getString("author"));
        return q;
      }
    });
    Random randomizer = new Random();
    return quotes.get(randomizer.nextInt(quotes.size()));
  }
}
