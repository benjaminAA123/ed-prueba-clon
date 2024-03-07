package com.iesam.firsttime.features.appconfig.domain;

public class GetAppConfigUseCase {

    private AppConfigRepository appConfigRepository;

    public GetAppConfigUseCase(AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }


    public AppConfig execute(){
        return appConfigRepository.getAppConfig();
    }
}
