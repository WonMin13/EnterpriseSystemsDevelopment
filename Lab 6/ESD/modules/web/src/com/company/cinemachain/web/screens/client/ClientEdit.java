package com.company.cinemachain.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.cinemachain.entity.Client;

@UiController("cinemachain_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}