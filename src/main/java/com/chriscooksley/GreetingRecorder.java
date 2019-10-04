package com.chriscooksley;

import java.util.List;

public interface GreetingRecorder {

    public void log(String greeting);

    public List<String> getGreetingLog();
}
