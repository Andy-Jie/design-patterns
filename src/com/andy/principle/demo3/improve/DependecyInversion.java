package com.andy.principle.demo3.improve;

public class DependecyInversion {

    public static void main(String[] args) {

        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());

    }

}

interface IReceiver{

    public String getInfo();

}

class Email implements IReceiver{

    public String getInfo(){
        return "电子邮件信息";
    }

}

class WeChat implements IReceiver{

    public String getInfo(){
        return "微信信息";
    }

}

class Person{

    public void receive(IReceiver receiver){

        System.out.println(receiver.getInfo());
    }

}
