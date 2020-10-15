package com.olo.behavior.interfaces;

import java.util.List;

import com.olo.behavior.domain.Habit;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Habit interface extends default JpaRepository
 */
public interface HabitInterface extends JpaRepository<Habit, Long> {

    List<Habit> getAllUsersHabits(String username);

    List<Habit> getAllPositiveHabitsByUser(String username);

    List<Habit> getAllNegativeHabitsByUser(String username);

    List<Habit> getAllOKHabitsByUser(String username);

}
