package spring.mvc.dao;

import spring.mvc.Model.Orders;

import java.util.List;

/**
 * Created by Alexander on 29/04/2017.
 */
public interface OrderDao {

    void save(Orders order);

    List<Orders> findAll();

    void removeAll();
}
