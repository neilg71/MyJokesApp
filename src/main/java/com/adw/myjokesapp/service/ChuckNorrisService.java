package com.adw.myjokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisService implements JokeService {
    ChuckNorrisQuotes cnq = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return cnq.getRandomQuote();
    }
}
