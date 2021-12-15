package ru.netology.manager;

import ru.netology.domain.FilmItem;

public class FilmManager {

    private int count = 10;

    // конструктор
    public FilmManager() {
    }

    // конструктор менеджера фильмов с заданием количества
    public FilmManager(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    private FilmItem[] items = new FilmItem[0];

    //добавление фильма
    public void add(FilmItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    //последние 10 фильмов
    public FilmItem[] getLastFilms() {
        int resultLength;
        int countReal = getCount();
        if (countReal < 10) {
            resultLength = countReal;
        } else {
            resultLength = 10;
        }

        FilmItem[] result = new FilmItem[resultLength];


        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }


        return result;
    }
}
