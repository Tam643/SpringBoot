package com.example.payroll;

public class OrderNotFoundException extends RuntimeException{
    OrderNotFoundException(Long id){ super("Cloud not found Order " + id);}
}
