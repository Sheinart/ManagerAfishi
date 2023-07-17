package ru.netology.ManagerAfisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerAfishaTest {
    @Test
    public void testOneFilms() {
        ManagerAfisha manager = new ManagerAfisha();

        manager.addFilm("Никогда не сдавайся");

        String[] expected = {"Никогда не сдавайся"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testZeroFilms() {
        ManagerAfisha manager = new ManagerAfisha();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllNineFilms() {
        ManagerAfisha manager = new ManagerAfisha();

        manager.addFilm("Никогда не сдавайся");
        manager.addFilm("Большой куш");
        manager.addFilm("Угнать за 60 секунд");
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек не ведимка");
        manager.addFilm("Троли. Мировой тур");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек не ведимка", "Троли. Мировой тур",};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllTwelveFilms() {
        ManagerAfisha manager = new ManagerAfisha();

        manager.addFilm("Никогда не сдавайся");
        manager.addFilm("Большой куш");
        manager.addFilm("Угнать за 60 секунд");
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек не ведимка");
        manager.addFilm("Троли. Мировой тур");
        manager.addFilm("Номер один");
        manager.addFilm("1 + 1");
        manager.addFilm("Пацанские истории");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек не ведимка", "Троли. Мировой тур", "Номер один", "1 + 1", "Пацанские истории"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitSeven() {
        ManagerAfisha manager = new ManagerAfisha(7);

        manager.addFilm("Никогда не сдавайся");
        manager.addFilm("Большой куш");
        manager.addFilm("Угнать за 60 секунд");
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitLessSix() {
        ManagerAfisha manager = new ManagerAfisha(7);

        manager.addFilm("Никогда не сдавайся");
        manager.addFilm("Большой куш");
        manager.addFilm("Угнать за 60 секунд");
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitMore() {
        ManagerAfisha manager = new ManagerAfisha(7);

        manager.addFilm("Никогда не сдавайся");
        manager.addFilm("Большой куш");
        manager.addFilm("Угнать за 60 секунд");
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек не ведимка");

        String[] expected = {"Никогда не сдавайся", "Большой куш", "Угнать за 60 секунд", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек не ведимка"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastFilms() {
        ManagerAfisha manager = new ManagerAfisha();
        manager.addFilm("Никогда не сдавайся");
        manager.addFilm("Большой куш");
        manager.addFilm("Угнать за 60 секунд");
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");

        String[] expected = {"Джентельмены", "Отель Белград", "Вперёд", "Бладшот", "Угнать за 60 секунд", "Большой куш", "Никогда не сдавайся"};
        String[] actual = manager.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimitOfFilmsIsTheSame() {
        ManagerAfisha manager = new ManagerAfisha(11);

        manager.findlast();

        manager.addFilm("Никогда не сдавайся");
        manager.addFilm("Большой куш");
        manager.addFilm("Угнать за 60 секунд");
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек не ведимка");
        manager.addFilm("Троли. Мировой тур");
        manager.addFilm("Номер один");
        manager.addFilm("1 + 1");

        String[] expected = {"1 + 1", "Номер один", "Троли. Мировой тур", "Человек не ведимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот", "Угнать за 60 секунд", "Большой куш", "Никогда не сдавайся"};
        String[] actual = manager.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
