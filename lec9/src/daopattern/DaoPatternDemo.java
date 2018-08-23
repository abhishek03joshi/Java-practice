/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daopattern;
import java.util.List;
/**
 *
 * @author Abhay
 */
public class DaoPatternDemo {
    public static void main(String args[])
    {
        
        System.out.println("DaoPattern.");
        OrderDao orderDao = new OrderDaoImpl();
        List<OrderPojo> orders = orderDao.getAllOrders();
        System.out.println(orders.indexOf(orders.get(1)));
        for(OrderPojo order1:orderDao.getAllOrders())
        {
            System.out.println("Order no:" +order1.getiOrderNo()+" "+"Customer Name: "+order1.getStrName());
            
        }
        
        System.out.println();
        OrderPojo order1 = orderDao.getAllOrders().get(0);
        order1.setStrName("Infosys");
        orderDao.updateOrder(order1);
        orderDao.getOrder(0);
        System.out.println("Order no: "+order1.getiOrderNo()+" Customer Name: "+order1.getStrName());
    }
    
}
