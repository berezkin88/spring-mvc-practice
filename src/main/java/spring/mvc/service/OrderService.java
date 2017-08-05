package spring.mvc.service;

import spring.mvc.Model.Orders;
import spring.mvc.dao.OrderDao;

import javax.transaction.Transactional;
import java.util.List;

public class OrderService {

    private OrderDao orderDao;

    @Transactional
    public List<Orders> getAllOrders(){
        return orderDao.findAll();
    }

    @Transactional
    public List getAllOpenOrders(){
        return orderDao.findAllOpen();
    }

    @Transactional
    public List getAllClosedOrders(){
        return orderDao.findAllClosed();
    }

    @Transactional
    public Orders getOrderById(Integer id){
        return orderDao.findById(id);
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
