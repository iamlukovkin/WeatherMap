package ru.iamlukovkin.map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ApplicationLauncherTest {

    @Test
    public void mainTest() {
        assertThrows(Exception.class, () -> ApplicationLauncher.main(null));
    }
}
