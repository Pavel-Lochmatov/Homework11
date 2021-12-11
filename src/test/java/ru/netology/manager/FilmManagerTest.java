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
        FilmItem first = new FilmItem(1, "first", "first");
        FilmItem second = new FilmItem(2, "second", "second");
        FilmItem third = new FilmItem(3, "third", "third");
        FilmItem fourth = new FilmItem(4, "fourth", "fourth");
        FilmItem fifth = new FilmItem(5, "fifth", "fifth");
        FilmItem sixth = new FilmItem(6, "sixth", "sixth");
        FilmItem seventh = new FilmItem(7, "seventh", "seventh");
        FilmItem eighth = new FilmItem(8, "eighth", "eighth");
        FilmItem ninth = new FilmItem(9, "ninth", "ninth");
        FilmItem tenth = new FilmItem(10, "tenth", "tenth");
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
        FilmItem first = new FilmItem(1, "first", "first");
        FilmItem second = new FilmItem(2, "second", "second");
        FilmItem third = new FilmItem(3, "third", "third");
        FilmItem fourth = new FilmItem(4, "fourth", "fourth");
        FilmItem fifth = new FilmItem(5, "fifth", "fifth");
        FilmItem sixth = new FilmItem(6, "sixth", "sixth");
        FilmItem seventh = new FilmItem(7, "seventh", "seventh");
        FilmItem eighth = new FilmItem(8, "eighth", "eighth");
        FilmItem ninth = new FilmItem(9, "ninth", "ninth");
        FilmItem tenth = new FilmItem(10, "tenth", "tenth");
        FilmItem eleven = new FilmItem(11, "eleven", "eleven");
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
        FilmItem first = new FilmItem(1, "first", "first");
        FilmItem second = new FilmItem(2, "second", "second");
        FilmItem third = new FilmItem(3, "third", "third");
        FilmItem fourth = new FilmItem(4, "fourth", "fourth");
        FilmItem fifth = new FilmItem(5, "fifth", "fifth");
        FilmItem sixth = new FilmItem(6, "sixth", "sixth");
        FilmItem seventh = new FilmItem(7, "seventh", "seventh");
        FilmItem eighth = new FilmItem(8, "eighth", "eighth");
        FilmItem ninth = new FilmItem(9, "ninth", "ninth");

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

