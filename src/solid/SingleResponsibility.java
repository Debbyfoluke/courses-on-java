package solid;

public class SingleResponsibility {

}


// For refrence Liskov principle demo
class A{ // base class

}

class B extends A { //Subclass

}

class C {
    A a;
    C(A e){
        this.a = e;
    }
}

class MainClass{
    public static void main(String[] args) {
        var a = new A();
        var b = new B();
        C objectOfC = new C(b); // substitution
    }
}

