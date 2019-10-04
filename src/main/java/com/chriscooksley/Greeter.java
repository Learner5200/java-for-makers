package com.chriscooksley;

public class Greeter {

    GreetingRecorder recorder;

    public Greeter(GreetingRecorder recorder) {
        this.recorder = recorder;
    }

    String greet(String name) {
        String greeting = "Hello " + name;
        recorder.log(greeting);
        return greeting;
    }

    public String getGreetingHistory() {
        return String.join("\n", recorder.getGreetingLog());
    }
}
