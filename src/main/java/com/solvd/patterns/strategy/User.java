package com.solvd.patterns.strategy;

public class User {

    private String name;
    private int age;
    private UsagePeriod usagePeriod;

    public User(String name, int age){
        this.name = name;
        this.age = age;
        this.usagePeriod = new FreeTrial();
    }

    public void doFunctions(){
        usagePeriod.doFunctions();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UsagePeriod getUsagePeriod() {
        return usagePeriod;
    }

    public void setUsagePeriod(UsagePeriod usagePeriod) {
        this.usagePeriod = usagePeriod;
    }
}
