/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daopattern;

/**
 *
 * @author Abhay
 */
import java.util.List;

public interface OrderDao {
    public List<OrderPojo>getAllOrders();
    public OrderPojo getOrder(int iOrderNo);
    public void updateOrder(OrderPojo order);
    public void deleteOrder(OrderPojo order);
    
}
