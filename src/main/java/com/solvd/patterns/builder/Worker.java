package com.solvd.patterns.builder;

import java.time.LocalDate;

/**
 * Example of usage: Can be used in big registration forms of the sites
 */

public class Worker {

    private String firstName;
    private String lastName;
    private String position;
    private String specialization;
    private LocalDate dob;
    private Integer experience;

    public static Builder builder(){
        return new Builder(new Worker());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getSpecialization() {
        return specialization;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "\nWorker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", specialization='" + specialization + '\'' +
                ", dob=" + dob +
                ", experience=" + experience +
                '}';
    }

    public static class Builder{

        private final Worker worker;

        private Builder(Worker worker){
            this.worker = worker;
        }

        public Builder firstName(String firstName){
            worker.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            worker.lastName = lastName;
            return this;
        }

        public Builder position(String position){
            worker.position = position;
            return this;
        }

        public Builder specialization(String specialization){
            worker.specialization = specialization;
            return this;
        }

        public Builder dob(LocalDate dob){
            worker.dob = dob;
            return this;
        }

        public Builder experience(Integer experience){
            worker.experience = experience;
            return this;
        }

        public Worker build(){
            return worker;
        }
    }
}
