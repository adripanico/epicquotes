package com.epicquotes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuoteController {

    @CrossOrigin(origins = "*")
    @RequestMapping("/random")
    public @ResponseBody Quote randomQuote() {
        return new Quote("¿A dónde vas? Patatas traigo", "Ortega y Pacheco");
    }

}