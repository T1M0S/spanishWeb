package com.spanish.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class Pronoun {
    private static final List<String> pronouns = new ArrayList<>(Arrays.asList("yo", "tu", "el", "ella", "usted",
            "nosotros", "vosotros", "ellos", "ellas", "ustedes"));


    public static String getPronoun() {
        return pronouns.get(new Random().nextInt(pronouns.size()));
    }
}

