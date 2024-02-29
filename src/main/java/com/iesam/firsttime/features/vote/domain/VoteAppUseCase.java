
package com.iesam.firsttime.features.vote.domain;

import com.iesam.firsttime.features.appconfig.data.AppConfigDataRepository;
import com.iesam.firsttime.features.appconfig.domain.AppConfig;
import com.iesam.firsttime.features.appconfig.domain.AppConfigRepository;

public class VoteAppUseCase {

    private AppConfigRepository appConfigRepository;
    private int totalOpened = 10;

    public VoteAppUseCase(AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }

    public boolean execute() {
        AppConfig appConfig = appConfigRepository.getAppConfig();
        return appConfig != null && appConfig.countTimeOpened == totalOpened;
    }
}
