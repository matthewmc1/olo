package com.olo.behavior.enums;

public enum Mood {
    HAPPY("Happy"), NOT_MEETING("Not Meeting"), OK("OK");

    private String mood;

    private Mood(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }    

    public void setMood(String mood) {
        this.mood = mood;
    }
}
