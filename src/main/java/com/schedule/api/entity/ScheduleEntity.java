package com.schedule.api.entity;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class ScheduleEntity {
    private Long id;
    private String description;
    private Date deadLine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }
}
