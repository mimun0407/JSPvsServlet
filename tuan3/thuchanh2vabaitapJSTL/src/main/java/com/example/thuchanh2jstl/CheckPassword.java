package com.example.thuchanh2jstl;

public class CheckPassword {
    public static boolean check(String username, String pass){
        Customer customer2=new Customer("b","2");
        Customer customer1=new Customer("a","1");
        Customer [] array={customer1,customer2};
        for (Customer i:array
             ) {
            if(i.getPassword().equals(pass) && i.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
    }

