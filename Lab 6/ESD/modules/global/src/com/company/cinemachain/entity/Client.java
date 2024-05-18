package com.company.cinemachain.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "CINEMACHAIN_CLIENT")
@Entity(name = "cinemachain_Client")
@NamePattern("%s|clientName")
public class Client extends StandardEntity {
    private static final long serialVersionUID = 6235012482071506813L;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    @Email
    private String email;

    @Column(name = "CLIENT_NAME")
    private String clientName;

    @Column(name = "CARD_INFO")
    @NotNull
    private String cardInfo;

    @NotNull
    @Column(name = "CLIENT_ID", nullable = false, unique = true)
    private String clientID;

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}