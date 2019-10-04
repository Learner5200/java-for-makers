package com.chriscooksley;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void greet_whenPassedAName_greetsThatPerson() {
        Greeter greeter = new Greeter(new ArrayListBackedGreetingRecorder());
        String greeting = greeter.greet("Chris");
        assertEquals("Hello Chris", greeting);
    }

    @Test
    public void getGreetingHistory_returnsAllGreetingsSeparatedByNewLines() {
        Greeter greeter = new Greeter(new LinkedListBackedGreetingRecorder());
        greeter.greet("Chris");
        greeter.greet("Henry");
        String history = "Hello Chris\nHello Henry";
        assertEquals(history, greeter.getGreetingHistory());
    }

}
