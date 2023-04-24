package com.traingft.imdb.jpa;

import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.traingft.imdb.BaseTestsWithConstructors;
import com.traingft.imdb.jpa.model.MoviesEntity;

import org.junit.jupiter.params.provider.Arguments;

@SpringBootTest
public class MovieRepositoryItTest extends BaseTestsWithConstructors{
    
    MoviesRepository moviesRepository;

    public MovieRepositoryItTest(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }


    @ParameterizedTest
    @MethodSource("expressionArguments")
    void findAllMovieInformationByExpression(String expression){

        moviesRepository.saveAndFlush(moviesEntity("Title", "inception 2010", null, ""));
        moviesRepository.saveAndFlush(moviesEntity("Movie", "inception 2010", null, ""));
        moviesRepository.saveAndFlush(moviesEntity("Movie", "expression", null, ""));

        List<MoviesEntity> actualList = moviesRepository.findAllMovieInformationByExpression(expression);

        for (MoviesEntity e : actualList)
            assertSame(e.getExpression(), actualList);;
    }

    static Stream<Arguments> searchTypeArguments_findAllByExpression(){
        return Stream.of(
            Arguments.of("Title"),
            Arguments.of("Movie"),
            Arguments.of("Series"),
            Arguments.of("Name"),
            Arguments.of("Episode"),
            Arguments.of("Company"),
            Arguments.of("Keyword"),
            Arguments.of("All")
        );
    }
}
