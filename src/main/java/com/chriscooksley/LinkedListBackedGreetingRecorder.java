package com.chriscooksley;

import java.util.LinkedList;

public class LinkedListBackedGreetingRecorder implements GreetingRecorder {

    private LinkedList<String> greetingLog = new LinkedList<String>();

    @Override
    public LinkedList<String> getGreetingLog() {
        return greetingLog;
    }

    public void log(String greeting) {
        greetingLog.add(greeting);
    }


}
