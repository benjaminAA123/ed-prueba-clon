package com.iesam.firsttime.features.appconfig.domain;

import com.iesam.firsttime.features.appconfig.data.StubAppConfigDataRepository;
import com.iesam.firsttime.features.appconfig.data.StubFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetAppConfigUseCaseTest {

    private GetAppConfigUseCase useCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        useCase = null;
    }

    @Test
    public void cuandoTodoEstaOkThenDevuelveElModel(){
        //Given
        AppConfig appConfig = StubFactory.buildAppConfig();
        useCase = new GetAppConfigUseCase(new StubAppConfigDataRepository());

        //When
        AppConfig result = useCase.execute();

        //Then
        Assertions.assertEquals(appConfig.countTimeOpened, result.countTimeOpened);
  }
}