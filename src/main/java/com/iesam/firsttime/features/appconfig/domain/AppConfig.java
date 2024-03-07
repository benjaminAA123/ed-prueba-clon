package com.iesam.firsttime.features.appconfig.domain;

import javax.print.attribute.HashDocAttributeSet;
import java.util.Objects;

public class AppConfig {
    public final int countTimeOpened;

    public AppConfig(int countTimeOpened) {
        this.countTimeOpened = countTimeOpened;
    }

}
