package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
//    Интервал
    public void shouldCalcExact() {
        SQRService service = new SQRService();
        int expected = 4;
        int actual = service.calculate(200,350);
        Assertions.assertEquals(expected,actual);

    }

    @Test
//    Верхния граница
    public void shouldCalcMax() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculate(9_801,100_000);
        Assertions.assertEquals(expected,actual);

    }

    @Test
//    Верхняя граница минус плюс 1
    public void shouldCalcOverMax() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(9_802,100_000);
        Assertions.assertEquals(expected,actual);

    }

    @Test
//    Верхнаяя граница минус 1
    public void shouldCalcBeforeMax() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculate(9_605, 9_801);
        Assertions.assertEquals(expected,actual);

    }

    @Test
//    Нижнаяя граница минус 1
    public void shouldCalcBeforeMin() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(1,99);
        Assertions.assertEquals(expected,actual);

    }
    @Test
//    Нижнаяя граница
    public void shouldCalcMin() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculate(1,100);
        Assertions.assertEquals(expected,actual);

    }
    @Test
//      Нижняя граница плюс 1
    public void shouldCalcOverMin() {
        SQRService service = new SQRService();
        int expected = 4;
        int actual = service.calculate(101,200);
        Assertions.assertEquals(expected,actual);

    }

    @Test
//    Нулевые значения в диапазоне
    public void shouldCalcZero() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(0,0);
        Assertions.assertEquals(expected,actual);

    }

    @Test
//    Отрицательные числа в диапазоне
    public void shouldCalcNegative() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(-100,0);
        Assertions.assertEquals(expected,actual);

    }
}
