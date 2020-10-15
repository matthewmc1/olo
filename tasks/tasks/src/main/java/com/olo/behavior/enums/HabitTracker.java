package com.olo.behavior.enums;

public enum HabitTracker {
    
    POSITIVE("Positive"), NEGATIVE("Negative"), NEUTRAL("Neutral");
    
    private String habitFeeling;

    private HabitTracker(String habitFeeling) {
        this.habitFeeling = habitFeeling;
    }

    public String getHabitTracker() {
        return habitFeeling;
    }

    public void setHabitTracker(String habitFeeling) {
        this.habitFeeling = habitFeeling;
    }
}
