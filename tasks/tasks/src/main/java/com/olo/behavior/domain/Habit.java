package com.olo.behavior.domain;

import javax.persistence.Entity;

import com.olo.behavior.enums.HabitTracker;
import com.olo.behavior.enums.Mood;

import io.micrometer.core.lang.NonNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Builder(builderMethodName = "createHabit")
@Getter
@Setter
public class Habit {
    
    @NonNull
    private long id;
    @NonNull
    private String habitName;
    @NonNull
    private String username;
    private HabitTracker habit;
    private double frequency;
    private Mood mood;
    private String notes;
    private boolean oldHabit;

}
