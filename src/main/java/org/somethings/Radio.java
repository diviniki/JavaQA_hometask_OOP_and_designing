package org.somethings;

public class Radio {
    // 1 Station
    // просто заводим переменную currentStation
    public int currentStation;

    // с помощью этого метода получаем запись для использования в других шаблонах
    public int getCurrentStation() {
        return currentStation;
    }

    //Создаем метод ограничивающий переключение станции в рамках диапазона 0-9
    public void setCurrentStation(int currentStation){
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    //Создаем метод переключения на след.станцию  (макс.9)
    public void setNextStation(){
        if (currentStation != 9) {
            currentStation++;
        }
        else currentStation = 0;
    }

    //Создаем метод переключения на перд.станцию  (мин.0)
    public void setPreviousStation(){
        if (currentStation != 0) {
            currentStation--;
        }
        else currentStation = 9;
    }


    // 2 Volume

    // просто заводим переменную currentStation
    public int currentVolume;

    // с помощью этого метода получаем запись для использования в других шаблонах
    public int getCurrentVolume() {
        return currentVolume;
    }

    //Создаем метод ограничивающий переключение громкости в рамках диапазона 0-100
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume<0){
            return;
        }
        if (currentVolume>100){
            return;
        }
        this.currentVolume = currentVolume;
    }

    // Увеличиваем громкость
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    // Уменьшаем громкость
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
