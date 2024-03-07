package com.iesam.firsttime.features.vote.data;

import com.iesam.firsttime.features.appconfig.domain.AppConfig;
import com.iesam.firsttime.features.appconfig.domain.AppConfigRepository;

public class StubEqual5AppConfigDataRepository implements AppConfigRepository {
    @Override
    public AppConfig getAppConfig() {
        return new AppConfig(10);
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}
