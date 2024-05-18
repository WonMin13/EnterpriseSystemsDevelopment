package com.company.cinemachain.web.screens.ticket;

import com.haulmont.cuba.gui.screen.*;
import com.company.cinemachain.entity.Ticket;

@UiController("cinemachain_Ticket.browse")
@UiDescriptor("ticket-browse.xml")
@LookupComponent("ticketsTable")
@LoadDataBeforeShow
public class TicketBrowse extends StandardLookup<Ticket> {
}