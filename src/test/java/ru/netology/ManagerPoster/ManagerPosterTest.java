package ru.netology.ManagerPoster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerPosterTest {


    @Test
    public void testOneFilms() {
        ManagerPoster poster = new ManagerPoster();

        poster.addFilm("Никогда не сдавайся");

        String[] expected = {"Никогда не сдавайся"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testZeroFilms() {
        ManagerPoster poster = new ManagerPoster();

        String[] expected = {};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testAllTwelveFilms() {
        ManagerPoster poster = new ManagerPoster();

        poster.addFilm("Никогда не сдавайся");
        poster.addFilm("Большой куш");
        poster.addFilm("Угнать за 60 секунд");
        poster.addFilm("Бладшот");
        poster.addFilm("Вперёд");
        poster.addFilm("Отель Белград");
        poster.addFilm("Джентельмены");
        poster.addFilm("Человек не ведимка");
        poster.addFilm("Троли. Мировой тур");
        poster.addFilm("Номер один");
        poster.addFilm("1 + 1");
        poster.addFilm("Пацанские истории");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек не ведимка", "Троли. Мировой тур", "Номер один", "1 + 1", "Пацанские истории"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitSeven() {
        ManagerPoster poster = new ManagerPoster(7);

        poster.addFilm("Никогда не сдавайся");
        poster.addFilm("Большой куш");
        poster.addFilm("Угнать за 60 секунд");
        poster.addFilm("Бладшот");
        poster.addFilm("Вперёд");
        poster.addFilm("Отель Белград");
        poster.addFilm("Джентельмены");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitLessSix() {
        ManagerPoster poster = new ManagerPoster(7);

        poster.addFilm("Никогда не сдавайся");
        poster.addFilm("Большой куш");
        poster.addFilm("Угнать за 60 секунд");
        poster.addFilm("Бладшот");
        poster.addFilm("Вперёд");
        poster.addFilm("Отель Белград");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitMoreSeven() {
        ManagerPoster poster = new ManagerPoster(7);

        poster.addFilm("Никогда не сдавайся");
        poster.addFilm("Большой куш");
        poster.addFilm("Угнать за 60 секунд");
        poster.addFilm("Бладшот");
        poster.addFilm("Вперёд");
        poster.addFilm("Отель Белград");
        poster.addFilm("Джентельмены");
        poster.addFilm("Человек не ведимка");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек не ведимка"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesLast() {
        ManagerPoster poster = new ManagerPoster(11);

        poster.findlast();

        poster.addFilm("Никогда не сдавайся");
        poster.addFilm("Большой куш");
        poster.addFilm("Угнать за 60 секунд");
        poster.addFilm("Бладшот");
        poster.addFilm("Вперёд");
        poster.addFilm("Отель Белград");
        poster.addFilm("Джентельмены");
        poster.addFilm("Человек не ведимка");
        poster.addFilm("Троли. Мировой тур");
        poster.addFilm("Номер один");

        String[] expected = {"Номер один", "Троли. Мировой тур", "Человек не ведимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот", "Угнать за 60 секунд", "Большой куш", "Никогда не сдавайся"};
        String[] actual = poster.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastFilms() {


        ManagerPoster poster = new ManagerPoster();
        poster.addFilm("Никогда не сдавайся");
        poster.addFilm("Большой куш");
        poster.addFilm("Угнать за 60 секунд");
        poster.addFilm("Бладшот");
        poster.addFilm("Вперёд");
        poster.addFilm("Отель Белград");
        poster.addFilm("Джентельмены");

        String[] expected = {"Джентельмены", "Отель Белград", "Вперёд", "Бладшот", "Угнать за 60 секунд", "Большой куш", "Никогда не сдавайся"};
        String[] actual = poster.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testLimitOfFilmsIsTheSame() {
        ManagerPoster poster = new ManagerPoster(11);

        poster.findlast();

        poster.addFilm("Никогда не сдавайся");
        poster.addFilm("Большой куш");
        poster.addFilm("Угнать за 60 секунд");
        poster.addFilm("Бладшот");
        poster.addFilm("Вперёд");
        poster.addFilm("Отель Белград");
        poster.addFilm("Джентельмены");
        poster.addFilm("Человек не ведимка");
        poster.addFilm("Троли. Мировой тур");
        poster.addFilm("Номер один");
        poster.addFilm("1 + 1");

        String[] expected = {"1 + 1", "Номер один", "Троли. Мировой тур", "Человек не ведимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот", "Угнать за 60 секунд", "Большой куш", "Никогда не сдавайся"};
        String[] actual = poster.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesMoreThenLimit() {
        ManagerPoster poster = new ManagerPoster();
        poster.setLimitFilms(5);
        poster.getLimitFilms();

        poster.addFilm("Никогда не сдавайся");
        poster.addFilm("Большой куш");
        poster.addFilm("Угнать за 60 секунд");
        poster.addFilm("Бладшот");
        poster.addFilm("Вперёд");
        poster.addFilm("Отель Белград");
        poster.addFilm("Джентельмены");
        poster.addFilm("Человек не ведимка");
        poster.addFilm("Троли. Мировой тур");
        poster.addFilm("Номер один");

        String[] expected = {"Номер один", "Троли. Мировой тур", "Человек не ведимка", "Джентельмены", "Отель Белград"};
        String[] actual = poster.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
