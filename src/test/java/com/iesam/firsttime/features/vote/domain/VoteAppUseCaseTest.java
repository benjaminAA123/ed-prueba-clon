package com.iesam.firsttime.features.vote.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoteAppUseCaseTest {

    VoteAppUseCase voteAppUseCase = null;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        voteAppUseCase = null;
    }

    @Test
    public void cuandoAppConfigEsNuloEntonceMostrarVotarEsFalse(){
        //Given/Dado
        voteAppUseCase = new VoteAppUseCase(
                new StubNullAppConfigDataRepository());

        //When / Cuando
        Boolean result = voteAppUseCase.execute();

        //Then/Entonce
        Assertions.assertFalse(result);
    }

    @Test
    public void cuandoLaAppSeHaAbiertoDistintoDeCincoEntoncesMostrarVotarEsFalse(){
        //Given
        voteAppUseCase = new VoteAppUseCase(
                new StubNot5AppConfigDataRepository());

        //When
        Boolean result = voteAppUseCase.execute();

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    public void cuandoLaAppSeHaAbiertoCincoVecesEntoncesMostrarVotarEsTrue(){
        //Given
        voteAppUseCase = new VoteAppUseCase(
                new StubEqual5AppConfigDataRepository());

        //When
        Boolean result = voteAppUseCase.execute();

        //Then
        Assertions.assertTrue(result);
    }
}