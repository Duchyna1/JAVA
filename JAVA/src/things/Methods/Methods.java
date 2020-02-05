package things.Methods;

class methodReturns {
    public static void main(String[] args) {
        methodVoid();
        System.out.println(methodInt(10));
    }
    static void methodVoid(){
        System.out.println("This return nothing.");
    }
    static int methodInt(int x){
        return x + 1;
    }
}