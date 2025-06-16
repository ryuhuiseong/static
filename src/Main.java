public class Main {
    String outerMessage = "Hello from Outer";

    class Inner {
        void showmessage(){
            System.out.println(outerMessage);
        }
    }

    public static void main(String[] args){
        Main main = new Main();

        Main.Inner inner = main.new Inner();

        inner.showmessage();
    }
}