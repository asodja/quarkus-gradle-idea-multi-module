package org.example;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class MyTest {

    @Test
    void shouldPass() {
        new MyService().returnSomething();
    }

}
