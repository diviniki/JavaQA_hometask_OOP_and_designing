import org.somethings.Radio;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
public class RadioTest {

    // ТЕСТЫ НА СТАНЦИЮ
    @Test // тест на текущую станцию
    public void shouldGetStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(5);

        int expected = 5;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на станцию < 0
    public void shouldGetStationIfNegative() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на станцию > 9
    public void shouldGetStationIfOver() {
        Radio cond = new Radio();

        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на следующую станцию
    public void shouldSetNextStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(5);
        cond.setNextStation();

        int expected = 6;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на следующую станцию 10 станцию
    public void shouldSetZeroStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(9);
        cond.setNextStation();

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на предыдущую станцию
    public void shouldSetPreviousStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(9);
        cond.setPreviousStation();

        int expected = 8;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на предыдущую станцию если текущая ноль
    public void shouldSetPreviousStationIfZero() {
        Radio cond = new Radio();

        cond.setCurrentStation(0);
        cond.setPreviousStation();

        int expected = 9;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // ТЕСТЫ НА УРОВЕНЬ ЗВУКА
    @Test // тест на текущий уровень звука
    public void shouldGetVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(5);

        int expected = 5;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на текущий уровень звука если меньше 0
    public void shouldGetVolumeIfNegative() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-5);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на текущий уровень звука если больше 100
    public void shouldGetVolumeIfOver() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на увеличение громкости
    public void shouldGetNextVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(50);
        cond.increaseVolume();

        int expected = 51;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на увеличение громкости, если 100
    public void shouldGetNextVolumeIfMax() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);
        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на уменьшение громкости
    public void shouldGetPreviousVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);
        cond.decreaseVolume();

        int expected = 99;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест на уменьшение громкости, если 0
    public void shouldGetPreviousVolumeIfMin() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);
        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
