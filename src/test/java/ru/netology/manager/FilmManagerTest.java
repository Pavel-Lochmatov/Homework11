package ru.netology.manager;


import ru.netology.domain.FilmItem;
import ru.netology.manager.FilmManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    //добавлено 10 фильмов, выдать все
    public void shouldLast10FilmsIfExist10() {
        FilmManager manager = new FilmManager();
        FilmItem first = new FilmItem(1, "first", "detective");
        FilmItem second = new FilmItem(2, "second", "melodrama");
        FilmItem third = new FilmItem(3, "third", "detective");
        FilmItem fourth = new FilmItem(4, "fourth", "drama");
        FilmItem fifth = new FilmItem(5, "fifth", "drama");
        FilmItem sixth = new FilmItem(6, "sixth", "drama");
        FilmItem seventh = new FilmItem(7, "seventh", "drama");
        FilmItem eighth = new FilmItem(8, "eighth", "drama");
        FilmItem ninth = new FilmItem(9, "ninth", "detective");
        FilmItem tenth = new FilmItem(10, "tenth", "detective");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        FilmItem[] actual = manager.getLastFilms();
        FilmItem[] expected = new FilmItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};


        assertArrayEquals(expected, actual);
    }

    @Test
    //добавлено фильмов больше 10, выдать последние 10
    public void shouldLast10FilmsIfExistMore10() {
        FilmManager manager = new FilmManager();
        FilmItem first = new FilmItem(1, "first", "drama");
        FilmItem second = new FilmItem(2, "second", "detective");
        FilmItem third = new FilmItem(3, "third", "thriller");
        FilmItem fourth = new FilmItem(4, "fourth", "detective");
        FilmItem fifth = new FilmItem(5, "fifth", "melodrama");
        FilmItem sixth = new FilmItem(6, "sixth", "detective");
        FilmItem seventh = new FilmItem(7, "seventh", "detective");
        FilmItem eighth = new FilmItem(8, "eighth", "melodrama");
        FilmItem ninth = new FilmItem(9, "ninth", "thriller");
        FilmItem tenth = new FilmItem(10, "tenth", "detective");
        FilmItem eleven = new FilmItem(11, "eleven", "thriller");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleven);
        FilmItem[] actual = manager.getLastFilms();
        FilmItem[] expected = new FilmItem[]{eleven, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    //добавлено фильмов меньше 10, выдать все
    public void shouldLast10FilmsIfExistLess10() {
        FilmManager manager = new FilmManager(9);
        FilmItem first = new FilmItem(1, "first", "drama");
        FilmItem second = new FilmItem(2, "second", "melodrama");
        FilmItem third = new FilmItem(3, "third", "thriller");
        FilmItem fourth = new FilmItem(4, "fourth", "horrors");
        FilmItem fifth = new FilmItem(5, "fifth", "detective");
        FilmItem sixth = new FilmItem(6, "sixth", "detective");
        FilmItem seventh = new FilmItem(7, "seventh", "melodrama");
        FilmItem eighth = new FilmItem(8, "eighth", "horrors");
        FilmItem ninth = new FilmItem(9, "ninth", "detective");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        FilmItem[] actual = manager.getLastFilms();
        FilmItem[] expected = new FilmItem[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }


}

