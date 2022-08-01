package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String key = reader.readLine();
            Movie movie = MovieFactory.getMovie(key);
            if (movie == null) {
                break;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            if ("soapOpera".equals(key)) {
                return new SoapOpera();
            } else if ("cartoon".equals(key)) {
                return new Cartoon();
            } else if ("thriller".equals(key)) {
                return new Thriller();
            } else
                return null;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
