package com.andy.principle.demo3.improve;

public class RelationPass {

    public static void main(String[] args) {

//        Open open = new Open();
//        open.open(new ChangHong());

//        Open open = new Open(new ChangHong());
//        open.open();

        Open open = new Open();
        open.setTv(new ChangHong());
        open.open();

    }

}

/*interface IOpen{

    public void open(ITV tv);

}

class Open implements IOpen{

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

interface ITV{

    public void play();

}

class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视机。。。");
    }
}*/

/*
interface IOpen{

    public void open();

}

class Open implements IOpen{

    private ITV tv;

    public Open() {
    }

    public Open(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}

interface ITV{

    public void play();

}

class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视机。。。");
    }
}*/

interface IOpen{

    public void open();

}

class Open implements IOpen{

    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}

interface ITV{

    public void play();

}

class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视机。。。");
    }
}






