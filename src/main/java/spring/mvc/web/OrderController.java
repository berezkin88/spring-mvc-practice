package spring.mvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.mvc.Model.Orders;
import spring.mvc.service.OrderService;

import java.util.List;

@RestController
public class OrderController {

    private OrderService orderService;

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public List order() {
        return orderService.getAllOrders();
    }

    @RequestMapping(value = "/order/open", method = RequestMethod.GET)
    public List openOrder() {
        return orderService.getAllOpenOrders();
    }

    @RequestMapping(value = "/order/close", method = RequestMethod.GET)
    public List closeOrder() {
        return orderService.getAllClosedOrders();
    }

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    public Orders employee(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
