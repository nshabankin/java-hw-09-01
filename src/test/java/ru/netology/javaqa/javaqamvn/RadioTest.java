package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() { // должен устанавливать номер радиостанции

        // объект класса
        Radio radio = new Radio();

        // тестовое действие
        radio.setCurrentStation(5);

        // ожидаемый результат
        int expected = 5;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() { // не должен устанавливать номер радиостанцию выше максимума

        // объект класса
        Radio radio = new Radio();

        // тестовое действие
        radio.setCurrentStation(10);

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() { // не должен устанавливать номер радиостанцию ниже минимума

        // объект класса
        Radio radio = new Radio();

        // тестовое действие
        radio.setCurrentStation(-1);

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() { // должен переключать радиостанцию на следующую

        // объект класса
        Radio radio = new Radio();

        // подготовительное действие
        radio.setCurrentStation(5);

        // тестовое действие
        radio.next();

        // ожидаемый результат
        int expected = 6;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationToZeroWhenMax() { // должен переключать на первую радиостанцию после последней

        // объект класса
        Radio radio = new Radio();

        // подготовительное действие
        radio.setCurrentStation(9);

        // тестовое действие
        radio.next();

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() { // должен переключать радиостанцию на предыдущую

        // объект класса
        Radio radio = new Radio();

        // подготовительное действие
        radio.setCurrentStation(5);

        // тестовое действие
        radio.prev();

        // ожидаемый результат
        int expected = 4;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationToNineWhenMin() { // должен переключать на последнюю радиостанцию перед первой

        // объект класса
        Radio radio = new Radio();

        // подготовительное действие
        radio.setCurrentStation(0);

        // тестовое действие
        radio.prev();

        // ожидаемый результат
        int expected = 9;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() { // должен устанавливать текущую громкость

        // объект класса
        Radio radio = new Radio();

        // тестовое действие
        radio.setCurrentVolume(50);

        // ожидаемый результат
        int expected = 50;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroVolume() { // должен устанавливать громкость на 0 вручную

        // объект класса
        Radio radio = new Radio();

        // тестовое действие
        radio.setCurrentVolume(0);

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() { // не должен устанавливать громкость выше максимума

        // объект класса
        Radio radio = new Radio();

        // тестовое действие
        radio.setCurrentVolume(101);

        // ожидаемый результат
        int expected = 100;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() { // не должен устанавливать громкость ниже минимума

        // объект класса
        Radio radio = new Radio();

        // тестовое действие
        radio.setCurrentVolume(-1);

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        // объект класса
        Radio radio = new Radio();

        // подготовительное действие
        radio.setCurrentVolume(50);

        // тестовое действие
        radio.increaseVolume();

        // ожидаемый результат
        int expected = 51;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {

        // объект класса
        Radio radio = new Radio();

        // подготовительное действие
        radio.setCurrentVolume(50);

        // тестовое действие
        radio.decreaseVolume();

        // ожидаемый результат
        int expected = 49;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeWhenMax() {

        // объект класса
        Radio radio = new Radio();

        // подготовительное действие
        radio.setCurrentVolume(100);

        // тестовое действие
        radio.increaseVolume();

        // ожидаемый результат
        int expected = 100;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeWhenMin() {

        // объект класса
        Radio radio = new Radio();

        // подготовительное действие
        radio.setCurrentVolume(0);

        // тестовое действие
        radio.decreaseVolume();

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        Assertions.assertEquals(expected, actual);
    }
}
