package com.example;

import java.time.*;

public class Order {
    private String order_id;
    private String order_date;
    private String customer_name;
    private LocalDateTime due_date;
    private double laundry_costs;
    private String fragrance_name;
    private float total_weight;
    private String status;
    private String payment_method;
    private String payment_status;
    private Item[] additionalItems;

    
    public Order(String order_id, String order_date, String customer_name, LocalDateTime due_date, double laundry_costs,
            String fragrance_name, float total_weight, String status, String payment_method, String payment_status,
            Item[] additionalItems) {

        this.order_id = order_id;
        this.order_date = order_date;
        this.customer_name = customer_name;
        this.due_date = due_date;
        this.laundry_costs = laundry_costs;
        this.fragrance_name = fragrance_name;
        this.total_weight = total_weight;
        this.status = status;
        this.payment_method = payment_method;
        this.payment_status = payment_status;
        this.additionalItems = additionalItems;
    }

    String generateOrderId(){
        String date = Integer.toString(LocalDateTime.now().getDayOfMonth());        
        String month = Integer.toString(LocalDateTime.now().getMonthValue());
        String year = Integer.toString(LocalDateTime.now().getYear());
    }

    

}
