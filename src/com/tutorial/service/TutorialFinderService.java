package com.tutorial.service;

/**
 * Created by Juniar_R on 7/07/2014.
 */
public class TutorialFinderService {
    public String getBestTutorialSite(String language) {
        if (language.equals("java")) {
            return "mitrais tutorial";
        }else if (language.equals("perl")) {
            return "CPAN";
        } else {
            return "language not supported";
        }
    }
}
