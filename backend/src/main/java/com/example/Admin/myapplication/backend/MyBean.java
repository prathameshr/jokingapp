package com.example.Admin.myapplication.backend;

import com.example.Joke;
/** The object model for the data we are sending through endpoints */
public class MyBean {

    private Joke myData;

	public MyBean() {
        myData = new Joke();
    }
    public String getJoke() {
        return myData.getRandomJoke();
    }

}