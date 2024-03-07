package com.iesam.firsttime.features.vote.domain;

import com.iesam.firsttime.features.vote.data.StubEqual5AppConfigDataRepository;
import com.iesam.firsttime.features.vote.data.StubNot5AppConfigDataRepository;
import com.iesam.firsttime.features.vote.data.StubNullAppConfigDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShowVoteAppMessageUseCaseTest {

    ShowVoteAppMessageUseCase showVoteAppMessageUseCase = null;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        showVoteAppMessageUseCase = null;
    }

    @Test
    public void cuandoAppConfigEsNuloEntonceMostrarVotarEsFalse(){
        //Given/Dado
        showVoteAppMessageUseCase = new ShowVoteAppMessageUseCase(
                new StubNullAppConfigDataRepository());

        //When / Cuando
        Boolean result = showVoteAppMessageUseCase.execute();

        //Then/Entonce
        Assertions.assertFalse(result);
    }

    @Test
    public void cuandoLaAppSeHaAbiertoDistintoDeCincoEntoncesMostrarVotarEsFalse(){
        //Given
        showVoteAppMessageUseCase = new ShowVoteAppMessageUseCase(
                new StubNot5AppConfigDataRepository());

        //When
        Boolean result = showVoteAppMessageUseCase.execute();

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    public void cuandoLaAppSeHaAbiertoCincoVecesEntoncesMostrarVotarEsTrue(){
        //Given
        showVoteAppMessageUseCase = new ShowVoteAppMessageUseCase(
                new StubEqual5AppConfigDataRepository());

        //When
        Boolean result = showVoteAppMessageUseCase.execute();

        //Then
        Assertions.assertTrue(result);
    }
}