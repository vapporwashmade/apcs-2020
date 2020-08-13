package org.apoorv.ap.cs2020practice;

public class RandomLetterChooser extends RandomStringChooser {

    public RandomLetterChooser(String str) {
        // check precondition: str contains only letters
        super(org.apoorv.progfun.RandomLetterChooser.getSingleLetters(str));
    }

}
