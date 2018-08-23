/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daopattern;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Abhay
 */
class OrderDaoImpl implements OrderDao {
    List<OrderPojo>Orders;
    public OrderDaoImpl()
    {
        Orders = new ArrayList<OrderPojo>();//Array list of object
        OrderPojo order1 = new OrderPojo("L & T",0);
        OrderPojo order2 = new OrderPojo("Reliance",1);
        Orders.add(order1);
        Orders.add(order2);
    }
    public List<OrderPojo>getAllOrders()
    {
        return Orders;
    }
    public OrderPojo getOrder(int iOrderNo)
    {
        return Orders.get(iOrderNo);
    }
    public void updateOrder(OrderPojo order)
    {
        Orders.get(order.getiOrderNo()).setStrName(order.getStrName());//left to right
        //OrderPojo old = orders.get(order.getOrderNo);
        //old.setStrName(order.getStrName());
        System.out.println("Order no:" +order.getiOrderNo()+" Updated in database");
    }
    public void deleteOrder(OrderPojo order)
    {
        Orders.remove(order.getiOrderNo());
        System.out.println("Order no:" +order.getiOrderNo()+" deleted from database");
    }
    
}
