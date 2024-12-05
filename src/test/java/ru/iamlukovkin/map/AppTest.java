package ru.iamlukovkin.map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {

    @Test
    public void launchTest() {
        assertThrows(Exception.class, App::launch);
    }
}
