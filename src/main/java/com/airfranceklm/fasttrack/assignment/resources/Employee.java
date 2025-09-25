package com.airfranceklm.fasttrack.assignment.resources;

import jakarta.persistence.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="EMPLOYEE")
public final class Employee {
    @Id
    private String id;

    private String name;

    @OneToMany(orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name="EMPLOYEE_ID")
    private Set<Holiday> holidays = new HashSet<>();

    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addHoliday(Holiday holiday) {
        this.holidays.add(holiday);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Holiday> getHolidays() {
        return Collections.unmodifiableSet(holidays);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
