package com.solvd.patterns.builder;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Worker vasya = Worker.builder()
                .firstName("Vasiliy")
                .lastName("Petrov")
                .dob(LocalDate.of(1960,8,20))
                .specialization("accountant")
                .experience(20)
                .build();

        Worker petya = Worker.builder()
                .firstName("Petr")
                .lastName("Ivanov")
                .dob(LocalDate.of(1981,5,13))
                .position("director")
                .experience(15)
                .build();

        Worker galya = Worker.builder()
                .firstName("Galina")
                .lastName("Petrova")
                .dob(LocalDate.of(1999,12,31))
                .position("head of sales department")
                .build();

        List<Worker> workers = List.of(vasya,petya,galya);
        System.out.println(workers);
    }
}
