package com.tutorial.action;

import com.tutorial.service.TutorialFinderService;

/**
 * Created by Juniar_R on 7/07/2014.
 */
public class TutorialAction {

    private String tutorial;
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTutorial() {
        return tutorial;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }

    public String execute() {
        TutorialFinderService service = new TutorialFinderService();
        setTutorial(service.getBestTutorialSite(getLanguage()));
        return "success";
    }
}
