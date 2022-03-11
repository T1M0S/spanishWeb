package com.spanish.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class Tense {
    private static final List<String> tenses =
            new ArrayList<>(Arrays.asList("Future", "Preterite",
                    "Present", "Imperfect", "Conditional"));

    public static String getTense() {
        return tenses.get(new Random().nextInt(tenses.size()));
    }
}
