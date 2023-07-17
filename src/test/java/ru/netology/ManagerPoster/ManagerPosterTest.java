package ru.netology.ManagerAfisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerAfishaTest {


    @Test
    public void testOneFilms() {
        ManagerAfisha afisha = new ManagerAfisha();

        afisha.addFilm("Никогда не сдавайся");

        String[] expected = {"Никогда не сдавайся"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testZeroFilms() {
        ManagerAfisha afisha = new ManagerAfisha();

        String[] expected = {};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testAllTwelveFilms() {
        ManagerAfisha afisha = new ManagerAfisha();

        afisha.addFilm("Никогда не сдавайся");
        afisha.addFilm("Большой куш");
        afisha.addFilm("Угнать за 60 секунд");
        afisha.addFilm("Бладшот");
        afisha.addFilm("Вперёд");
        afisha.addFilm("Отель Белград");
        afisha.addFilm("Джентельмены");
        afisha.addFilm("Человек не ведимка");
        afisha.addFilm("Троли. Мировой тур");
        afisha.addFilm("Номер один");
        afisha.addFilm("1 + 1");
        afisha.addFilm("Пацанские истории");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек не ведимка", "Троли. Мировой тур", "Номер один", "1 + 1", "Пацанские истории"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitSeven() {
        ManagerAfisha afisha = new ManagerAfisha(7);

        afisha.addFilm("Никогда не сдавайся");
        afisha.addFilm("Большой куш");
        afisha.addFilm("Угнать за 60 секунд");
        afisha.addFilm("Бладшот");
        afisha.addFilm("Вперёд");
        afisha.addFilm("Отель Белград");
        afisha.addFilm("Джентельмены");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitLessSix() {
        ManagerAfisha afisha = new ManagerAfisha(7);

        afisha.addFilm("Никогда не сдавайся");
        afisha.addFilm("Большой куш");
        afisha.addFilm("Угнать за 60 секунд");
        afisha.addFilm("Бладшот");
        afisha.addFilm("Вперёд");
        afisha.addFilm("Отель Белград");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitMoreSeven() {
        ManagerAfisha afisha = new ManagerAfisha(7);

        afisha.addFilm("Никогда не сдавайся");
        afisha.addFilm("Большой куш");
        afisha.addFilm("Угнать за 60 секунд");
        afisha.addFilm("Бладшот");
        afisha.addFilm("Вперёд");
        afisha.addFilm("Отель Белград");
        afisha.addFilm("Джентельмены");
        afisha.addFilm("Человек не ведимка");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек не ведимка"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesLast() {
        ManagerAfisha afisha = new ManagerAfisha(11);

        afisha.findlast();

        afisha.addFilm("Никогда не сдавайся");
        afisha.addFilm("Большой куш");
        afisha.addFilm("Угнать за 60 секунд");
        afisha.addFilm("Бладшот");
        afisha.addFilm("Вперёд");
        afisha.addFilm("Отель Белград");
        afisha.addFilm("Джентельмены");
        afisha.addFilm("Человек не ведимка");
        afisha.addFilm("Троли. Мировой тур");
        afisha.addFilm("Номер один");

        String[] expected = {"Номер один", "Троли. Мировой тур", "Человек не ведимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот", "Угнать за 60 секунд", "Большой куш", "Никогда не сдавайся"};
        String[] actual = afisha.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastFilms() {


        ManagerAfisha afisha = new ManagerAfisha();
        afisha.addFilm("Никогда не сдавайся");
        afisha.addFilm("Большой куш");
        afisha.addFilm("Угнать за 60 секунд");
        afisha.addFilm("Бладшот");
        afisha.addFilm("Вперёд");
        afisha.addFilm("Отель Белград");
        afisha.addFilm("Джентельмены");

        String[] expected = {"Джентельмены", "Отель Белград", "Вперёд", "Бладшот", "Угнать за 60 секунд", "Большой куш", "Никогда не сдавайся"};
        String[] actual = afisha.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testLimitOfFilmsIsTheSame() {
        ManagerAfisha afisha = new ManagerAfisha(11);

        afisha.findlast();

        afisha.addFilm("Никогда не сдавайся");
        afisha.addFilm("Большой куш");
        afisha.addFilm("Угнать за 60 секунд");
        afisha.addFilm("Бладшот");
        afisha.addFilm("Вперёд");
        afisha.addFilm("Отель Белград");
        afisha.addFilm("Джентельмены");
        afisha.addFilm("Человек не ведимка");
        afisha.addFilm("Троли. Мировой тур");
        afisha.addFilm("Номер один");
        afisha.addFilm("1 + 1");

        String[] expected = {"1 + 1", "Номер один", "Троли. Мировой тур", "Человек не ведимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот", "Угнать за 60 секунд", "Большой куш", "Никогда не сдавайся"};
        String[] actual = afisha.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesMoreThenLimit() {
        ManagerAfisha afisha = new ManagerAfisha();
        afisha.setLimitFilms(5);
        afisha.getLimitFilms();

        afisha.addFilm("Никогда не сдавайся");
        afisha.addFilm("Большой куш");
        afisha.addFilm("Угнать за 60 секунд");
        afisha.addFilm("Бладшот");
        afisha.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек не ведимка");
        manager.addFilm("Троли. Мировой тур");
        manager.addFilm("Номер один");

        String[] expected = {"Номер один", "Троли. Мировой тур", "Человек не ведимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
