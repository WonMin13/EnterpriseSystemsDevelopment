package com.company.cinemachain.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "CINEMACHAIN_TICKET")
@Entity(name = "cinemachain_Ticket")
@NamePattern("%s|ticketName")
public class Ticket extends StandardEntity {
    private static final long serialVersionUID = -7864342083518607605L;

    @NotNull
    @Column(name = "TICKET_NAME", nullable = false)
    private String ticketName;

    @Column(name = "PLACE")
    @NotNull
    private Integer place;

    @NotNull
    @Column(name = "TICKET_ID", nullable = false, unique = true)
    private String ticketID;

    @Column(name = "CINEMA_ID")
    @NotNull
    private Integer cinemaID;

    @Temporal(TemporalType.TIME)
    @NotNull
    @Column(name = "TICKET_TIME", nullable = false)
    private Date ticketTime;

    @Column(name = "COST")
    @NotNull
    private Integer cost;

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Date getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(Date ticketTime) {
        this.ticketTime = ticketTime;
    }

    public Integer getCinemaID() {
        return cinemaID;
    }

    public void setCinemaID(Integer cinemaID) {
        this.cinemaID = cinemaID;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }
}