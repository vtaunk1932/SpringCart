package com.vasu.electronic.store.services;

import com.vasu.electronic.store.dtos.CreateOrderRequest;
import com.vasu.electronic.store.dtos.OrderDto;
import com.vasu.electronic.store.dtos.OrderUpdateRequest;
import com.vasu.electronic.store.dtos.PageableResponse;

import java.util.List;

public interface OrderService {

    OrderDto getOrder(String orderId);

    //create order
    OrderDto createOrder(CreateOrderRequest orderDto);

    //remove order
    void removeOrder(String orderId);

    //get orders of user
    List<OrderDto> getOrdersOfUser(String userId);

    //get orders
    PageableResponse<OrderDto> getOrders(int pageNumber, int pageSize, String sortBy, String sortDir);

    OrderDto updateOrder(String orderId, OrderUpdateRequest request);
    OrderDto updateOrder(String orderId, OrderDto request);

    //order methods(logic) related to order

}
