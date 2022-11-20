package com.adw.myjokesapp.controller;

import com.adw.myjokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public JokeService getJokeService() {
        return jokeService;
    }

    @RequestMapping("/getQuote")
    public String getQuote(Model model){
        String quote = getJokeService().getJoke();
        System.out.println( quote);
        model.addAttribute("quotes",quote );
        return "quotes/list";
    }

    @Override
    public String toString() {
        return "JokeController{" +
                "jokeService=" + jokeService +
                '}';
    }


}
