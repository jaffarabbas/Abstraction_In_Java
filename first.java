

abstract class ones{
    abstract void one1();
    abstract void one2();
    abstract void one3();
}

class child extends ones{
    void one1(){
        var var1 = "jelldfsd";
        System.out.println("hello"+var1);
    }
    void one2(){
        System.out.println("hello");
    }
    void one3(){
        System.out.println("hello");
    }
}


class first{
    public static void main(String[] args) {
        child obj = new child();

        obj.one1();
        obj.one2();
        obj.one3();
    }
}