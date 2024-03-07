package com.iesam.firsttime.features.vote.presentation;

import com.iesam.firsttime.features.appconfig.data.AppConfigDataRepository;
import com.iesam.firsttime.features.appconfig.data.local.FileLocalDataSource;
import com.iesam.firsttime.features.vote.domain.ShowVoteAppMessageUseCase;

public class VotePresentation {

    public static void showVoteApp() {
        ShowVoteAppMessageUseCase showVoteAppMessageUseCase = new ShowVoteAppMessageUseCase(
                new AppConfigDataRepository(new FileLocalDataSource()));
        boolean showVoteApp = showVoteAppMessageUseCase.execute();
        if (showVoteApp) {
            System.out.println("Por favor, vote nuestra app ....");
        }
    }

}
