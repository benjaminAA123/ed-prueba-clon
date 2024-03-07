package com.iesam.firsttime.features.appconfig.data;

import com.iesam.firsttime.features.appconfig.domain.AppConfig;

public class StubFactory {

    public static AppConfig buildAppConfig(){
        return new AppConfig(1345);
    }
}
