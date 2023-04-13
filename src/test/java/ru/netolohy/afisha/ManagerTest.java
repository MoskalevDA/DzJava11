package ru.netolohy.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class ManagerTest {

    Posters film1 = new Posters(1, 100, "Film 1");
    Posters film2 = new Posters(2, 101, "Film 2");
    Posters film3 = new Posters(3, 102, "Film 3");
    Posters film4 = new Posters(4, 103, "Film 4");
    Posters film5 = new Posters(5, 104, "Film 5");
    Posters film6 = new Posters(6, 105, "Film 6");
    Posters film7 = new Posters(7, 106, "Film 7");
    Posters film8 = new Posters(8, 107, "Film 8");
    Posters film9 = new Posters(9, 108, "Film 9");
    Posters film10 = new Posters(10, 109, "Film 10");
    Posters film11 = new Posters(11, 110, "Film 11");
    Manager manager = new Manager(10);

    @Test
    public void testShouldFindAll() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        Posters[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        Posters[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testShouldFindAllIfOne() {
        manager.addFilm(film1);


        Posters[] expected = {film1};
        Posters[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindAllIfNoFilms() {
        Posters[] expected = new Posters[0];
        Posters[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindLastIfAll() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        Posters[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        Posters[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindLastIfNotAll() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);


        Posters[] expected = {film5, film4, film3, film2, film1};
        Posters[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindLastBoundaryValuesNull() {

        Posters[] expected = new Posters[0];
        Posters[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindLastBoundaryValuesOne() {
        manager.addFilm(film1);

        Posters[] expected = {film1};
        Posters[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindLastBoundaryValuesOver() {

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        Posters[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        Posters[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldSetNewLimit() {
        Manager manager = new Manager(11);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        Posters[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        Posters[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldSetLimitByDefault() {
        Manager manager = new Manager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        Posters[] expected = {film11, film10, film9, film8, film7};
        Posters[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}