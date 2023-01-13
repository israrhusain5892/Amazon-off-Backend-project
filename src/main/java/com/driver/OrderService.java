package com.driver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public void addOrder(Order order){
        orderRepository.addOrder(order);
    }

    
    public  void addpartnerBy(String partneId){
        orderRepository.addDeliverypartner(partneId);
    }


    public void addorderpartner(String partnerId,String orderId){
        orderRepository.addorderpartner(partnerId,orderId);;
    }

    public void addDeliverypartnerpair(String partnerId, String orderId){

        orderRepository.addDeliverypartnerpair(partnerId,orderId);
    }
    
    // get order
    
    public Order getOrderById(String orderId){
        return orderRepository.getOrderById(orderId);
        
    }
    
    public DeliveryPartner getPartner(String partnerId){
        return orderRepository.getPartner(partnerId);
    }
    
    public Integer getNumbersOrderbypartnerId(String partnerId){
        return orderRepository.getNumbersOrderbypartnerId(partnerId);
    }


     public List<String> getListorder(String partnerId){
              List<String> list=new ArrayList<>();
              list=orderRepository.getListorder(partnerId);

              return list;
            }
         
          

     public List<String> getallOrderList(){
        List<String> list=new ArrayList<>(); 
          list=orderRepository.getallOrderList();

          return list;
            
    }
    
    public Integer getUnassignedCountorder(){

        return orderRepository.getUnassignedCountorder();

        }


    public Integer getOrdersLeft(String time,String partnerId){
            
        return orderRepository.getOrdersLeft(time,partnerId);
    }



    public String getLasttime(String partnerId){
        return orderRepository.getLasttime(partnerId);
    }


    public  void deletePartner(String partnerId){
      orderRepository.deletePartner(partnerId);
    }
    
    
    public  void deleteOrder(String orderId){
      
       orderRepository.deleteOrder(orderId);
    
    }

    }
    
    

