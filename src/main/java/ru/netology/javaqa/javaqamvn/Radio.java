package ru.netology.javaqa.javaqamvn;

public class Radio {
    private int numberOfStations = 10; // поле количества радиостанций, по умолчанию 10
    private int currentStation; // поле текущей радиостанции с приватным доступом
    private int currentVolume; // поле текущей громкости с приватным доступом

    public Radio() { // конструктор класса без параметров

    }

    public Radio(int numberOfStations) { // конструктор класса с возможностью ввода количества радиостанций
        this.numberOfStations = numberOfStations; // новое количество радиостанций
    }

    public int getNumberOfStations() { // getter количества радиостанций
        return numberOfStations;
    }

    public int getCurrentStation() { // getter текущей радиостанции
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) { // setter ручного ввода радиостанции
        if (newCurrentStation < 0) {
            return; // early exit method, если значение меньше минимального
        }
        if (newCurrentStation > numberOfStations - 1) { // максимальный номер станции
            return; // early exit method, если значение больше максимального
        }
        currentStation = newCurrentStation; // в ином случае приписываем новое значение
    }

    public void next() { // метод выбора следующей радиостанции
        if (currentStation < numberOfStations - 1) { // если текущая радиостанция не последняя,
            currentStation = currentStation + 1; // то прибавляем 1
        } else {
            currentStation = 0; // иначе переходим на 0
        }
    }

    public void prev() { // метод выбора предыдущей радиостанции
        if (currentStation > 0) { // если текущая радиостанция не 0,
            currentStation = currentStation - 1; // то вычитаем 1
        } else {
            currentStation = numberOfStations - 1; // иначе переходим на последнюю
        }
    }

    public int getCurrentVolume() { // getter текущей громкости
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { // setter ручного ввода громкости
        if (newCurrentVolume < 0) {
            return; // при вводе значения меньше минимального, оставляем минимальное
        }

        if (newCurrentVolume > 100) {
            currentVolume = 100; // при вводе значения выше максимального, оставляем максимальное
        } else {
            currentVolume = newCurrentVolume; // в ином случае приписываем новое значение
        }

    }

    public void increaseVolume() {
        if (currentVolume < 100) { // если текущая громкость не 100,
            currentVolume = currentVolume + 1; // то прибавляем 1
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) { // если текущая громкость не 0,
            currentVolume = currentVolume - 1; // то вычитаем 1
        }
    }

}
