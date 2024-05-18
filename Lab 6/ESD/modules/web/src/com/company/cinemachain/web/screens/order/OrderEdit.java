package com.company.cinemachain.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.cinemachain.entity.Order;

@UiController("cinemachain_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}