package com.company.cinemachain.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.cinemachain.entity.Order;

@UiController("cinemachain_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}