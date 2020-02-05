package things.Class;

class publicVsStatic {
    static void staticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void publicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        staticMethod();

        publicVsStatic myObj = new publicVsStatic();
        myObj.publicMethod();
    }
}
class run {
    public static void main(String[] args) {
        test object = new test(1, 2, 3);
        System.out.println(Integer.toString(object.x) + " " + Integer.toString(object.y) + " " + Integer.toString(object.z));
    }
}
class test {
    int x, y, z;
    public test(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    }
}