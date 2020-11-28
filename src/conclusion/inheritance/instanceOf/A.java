package conclusion.inheritance.instanceOf;

class A {
    public static void main(String[] args) {
        B obj = new B();

        if ((obj instanceof A) && ! (obj instanceof C) && ! (obj instanceof D)){
            System.out.println(true);
        }else System.out.println(false);;
    }
}

class B extends A {
}

class C extends B {
}

class D extends C {
}

