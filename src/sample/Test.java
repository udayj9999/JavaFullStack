package sample;

public class Test {
    public void addition(){
        System.out.println("hello");

    }
    public int display(int i){
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.addition();
       test.display(7);
    }
}
