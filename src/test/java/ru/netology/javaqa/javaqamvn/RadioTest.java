package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // предзаданный объект класса с новым количеством радиостанций
    Radio radio = new Radio(21);

    @Test
    public void shouldSetStation() { // должен устанавливать номер радиостанции

        // тестовое действие
        radio.setCurrentStation(5);

        // ожидаемый результат
        int expected = 5;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() { // не должен устанавливать номер радиостанцию выше максимума

        // тестовое действие
        radio.setCurrentStation(22);

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() { // не должен устанавливать номер радиостанцию ниже минимума

        // тестовое действие
        radio.setCurrentStation(-1);

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() { // должен переключать радиостанцию на следующую

        // подготовительное действие
        radio.setCurrentStation(5);

        // тестовое действие
        radio.next();

        // ожидаемый результат
        int expected = 6;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationToZeroWhenMax() { // должен переключать на первую радиостанцию после последней

        // подготовительное действие
        radio.setCurrentStation(radio.getNumberOfStations() - 1);

        // тестовое действие
        radio.next();

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() { // должен переключать радиостанцию на предыдущую

        // подготовительное действие
        radio.setCurrentStation(5);

        // тестовое действие
        radio.prev();

        // ожидаемый результат
        int expected = 4;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationToNineWhenMin() { // должен переключать на последнюю радиостанцию перед первой

        // подготовительное действие
        radio.setCurrentStation(0);

        // тестовое действие
        radio.prev();

        // ожидаемый результат
        int expected = radio.getNumberOfStations() - 1;

        // фактический результат
        int actual = radio.getCurrentStation();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() { // должен устанавливать текущую громкость

        // тестовое действие
        radio.setCurrentVolume(50);

        // ожидаемый результат
        int expected = 50;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroVolume() { // должен устанавливать громкость на 0 вручную

        // тестовое действие
        radio.setCurrentVolume(0);

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() { // не должен устанавливать громкость выше максимума

        // тестовое действие
        radio.setCurrentVolume(101);

        // ожидаемый результат
        int expected = 100;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() { // не должен устанавливать громкость ниже минимума

        // тестовое действие
        radio.setCurrentVolume(-1);

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() { // должен увеличивать громкость на 1

        // подготовительное действие
        radio.setCurrentVolume(50);

        // тестовое действие
        radio.increaseVolume();

        // ожидаемый результат
        int expected = 51;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() { // должен уменьшать громкость на 1

        // подготовительное действие
        radio.setCurrentVolume(50);

        // тестовое действие
        radio.decreaseVolume();

        // ожидаемый результат
        int expected = 49;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeWhenMax() { // громкость не должна превышать максимальную при увеличении

        // подготовительное действие
        radio.setCurrentVolume(100);

        // тестовое действие
        radio.increaseVolume();

        // ожидаемый результат
        int expected = 100;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeWhenMin() { // громкость не должна превышать минимальную при уменьшении

        // подготовительное действие
        radio.setCurrentVolume(0);

        // тестовое действие
        radio.decreaseVolume();

        // ожидаемый результат
        int expected = 0;

        // фактический результат
        int actual = radio.getCurrentVolume();

        // проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }
}
