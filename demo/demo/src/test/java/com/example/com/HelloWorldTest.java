package com.example.com;

import org.junit.jupiter.api.Test;

import com.example.demo.HelloWorld;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    void testMainPrintsHelloWorld() {
        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run main method
        HelloWorld.main(new String[]{});

        // Check output
        assertEquals("Hello, World!" + System.lineSeparator(), outContent.toString());

        // Restore standard out
        System.setOut(System.out);
    }
}
