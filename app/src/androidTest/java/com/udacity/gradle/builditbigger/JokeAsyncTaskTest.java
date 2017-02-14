package com.udacity.gradle.builditbigger;


import android.test.AndroidTestCase;
import android.util.Log;

import com.example.Joke;

import java.util.concurrent.ExecutionException;

public class JokeAsyncTaskTest extends AndroidTestCase{

    private static final String TAG = JokeAsyncTaskTest.class.getSimpleName();

    public void testFetchesNonEmptyString() {
        JokeAsyncTask jokeTask = new JokeAsyncTask(getContext(),null);
        jokeTask.execute();
        try {
            String joke = jokeTask.get();
            Log.d(TAG, "Joke text: " + joke);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException | ExecutionException e) {
            Log.e(TAG, Log.getStackTraceString(e));
        }
    }
}
