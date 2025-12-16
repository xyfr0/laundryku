package com.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.toString(LocalDateTime.now().getYear()).substring(2));
    }
}