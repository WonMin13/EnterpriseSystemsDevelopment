package com.company.cinemachain.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.cinemachain.entity.Client;

@UiController("cinemachain_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}