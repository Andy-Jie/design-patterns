package com.andy.uml.demo1;

public class Dependency {

    private PersonDao personDao;

    public void save(Person person){}

    public IDCard get(){
        return null;
    }

    public void modify(){
        Department department = new Department();
    }

}

