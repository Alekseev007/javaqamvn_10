package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilmManagerTest {

    @Test
    public void testNoAddFilm() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testOneAddFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testAddSomeFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель 'Белград'");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");


        String[] expected = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void findLast1() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");

        String[] expected = {"Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void findLast2() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");


        String[] expected = {"Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void findLast3() {
        FilmManager manager = new FilmManager();



        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void findLast4() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель 'Белград'");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель 'Белград'"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void findLastSetLimit() {
        FilmManager manager = new FilmManager(3);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель 'Белград'");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void findLastSetLimit1() {
        FilmManager manager = new FilmManager(8);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель 'Белград'");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель 'Белград'", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

}