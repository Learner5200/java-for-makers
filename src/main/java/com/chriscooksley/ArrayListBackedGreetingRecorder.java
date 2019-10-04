package com.chriscooksley;

import java.util.ArrayList;

public class ArrayListBackedGreetingRecorder implements GreetingRecorder{
    ArrayList<String> greetingLog = new ArrayList<>();

    public ArrayList<String> getGreetingLog() {
        return greetingLog;
    }

    public void log(String greeting) {
        greetingLog.add(greeting);
    }


}
