package com.iesam.firsttime.features;

import com.iesam.firsttime.features.appconfig.domain.AppConfig;
import com.iesam.firsttime.features.appconfig.presentation.AppConfigPresentation;
import com.iesam.firsttime.features.vote.presentation.VotePresentation;
import com.iesam.firsttime.features.welcome.presentation.WelcomePresentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        AppConfigPresentation.appOpened();
        WelcomePresentation.showWelcomeMessage();
        VotePresentation.showVoteApp();
    }
}
