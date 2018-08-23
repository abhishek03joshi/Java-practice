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
class OrderPojo {
    
    private String strName;
    private int iOrderNo;
    
    public OrderPojo(String strName,int iOrderNo)
    {
        this.strName = strName;
        this.iOrderNo = iOrderNo;
    }
            
    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public int getiOrderNo() {
        return iOrderNo;
    }

    public void setiOrderNo(int iOrderNo) {
        this.iOrderNo = iOrderNo;
    }

    
    
    
}
