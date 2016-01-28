package com.epicquotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuoteController {
	
	@Autowired
	private QuoteService qService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/random")
    public @ResponseBody Quote randomQuote() {
        return qService.getRandomQuote();
    }

}