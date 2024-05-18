package com.company.cinemachain.web.screens.ticket;

import com.haulmont.cuba.gui.screen.*;
import com.company.cinemachain.entity.Ticket;

@UiController("cinemachain_Ticket.edit")
@UiDescriptor("ticket-edit.xml")
@EditedEntityContainer("ticketDc")
@LoadDataBeforeShow
public class TicketEdit extends StandardEditor<Ticket> {
}