package com.andy.principle.demo3;

public class DependecyInversion {

    public static void main(String[] args) {

        Person person = new Person();
        person.receive(new Email());

    }

}

class Email{

    public String getInfo(){
        return "电子邮件信息";
    }

}

class Person{

    public void receive(Email email){

        System.out.println(email.getInfo());
    }

}
