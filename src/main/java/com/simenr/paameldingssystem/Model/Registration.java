package com.simenr.paameldingssystem.Model;

import jakarta.persistence.*;

import java.util.Date;

@IdClass(Registration.class)
@Entity
public class Registration {

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private boolean status;

    private Date timeWhenRegistered;

    public Event getEvent() {
        return event;
    }

    private void setEvent(Event event) {
        this.event = event;
    }

    public boolean isStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

    public Date getTimeWhenRegistered() {
        return timeWhenRegistered;
    }

    private void setTimeWhenRegistered(Date timeWhenRegistered) {
        this.timeWhenRegistered = timeWhenRegistered;
    }

    public User getUser() {
        return user;
    }

    private void setUser(User user) {
        this.user = user;
    }
}
