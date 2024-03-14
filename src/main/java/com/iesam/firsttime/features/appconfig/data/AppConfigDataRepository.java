package com.iesam.firsttime.features.appconfig.data;

import com.iesam.firsttime.features.appconfig.data.local.FileLocalDataSource;
import com.iesam.firsttime.features.appconfig.domain.AppConfig;
import com.iesam.firsttime.features.appconfig.domain.AppConfigRepository;

public class AppConfigDataRepository implements AppConfigRepository {

    private FileLocalDataSource fileLocalDataSource;

    public AppConfigDataRepository(FileLocalDataSource fileLocalDataSource) {
        this.fileLocalDataSource = fileLocalDataSource;
    }



    @Override
    public AppConfig getAppConfig() {
        return fileLocalDataSource.obtain();
    }


    @Override
    public void saveAppConfig(AppConfig appConfig) {
        fileLocalDataSource.save(appConfig);
    }
}
