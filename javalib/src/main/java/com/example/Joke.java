package com.example;

import java.util.Random;

public class Joke {
    private String[] jokesArray;
    private Random rand;

    public Joke() {
        jokesArray = new String[10];
        jokesArray[0] = "If at first you don't succeed; call it version 1.0.";
        jokesArray[1] = "My software never has bugs. It just develops random features.";
        jokesArray[2] = "I would love to change the world, but they won't give me the source code.";
        jokesArray[3] = "If Ruby is not and Perl is the answer, you don't understand the question.";
        jokesArray[4] = "A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"";
        jokesArray[5] = "Programmers are tools for converting caffeine into code.";
        jokesArray[6] = "My attitude isn't bad. It's in beta.";
        jokesArray[7] = "Q: How many prolog programmers does it take to change a lightbulb? A: Yes.";
        jokesArray[8] = "Why do Java developers wear glasses? Because they can't C#";
        jokesArray[9] = "I'm not anti-social; I'm just not user friendly.";

        rand = new Random();
    }

    public String getRandomJoke() {
        return jokesArray[rand.nextInt(jokesArray.length)];
    }

}
