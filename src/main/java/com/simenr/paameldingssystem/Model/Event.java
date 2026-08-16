package com.simenr.paameldingssystem.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int event_id;

    private String name;
    private Date time;
    private int capacity;

    @OneToMany
    private List<Registration> listOfRegistration;

    public Event(String name, Date time, int capacity) {
        this.name = name;
        this.time = time;
        this.capacity = capacity;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
