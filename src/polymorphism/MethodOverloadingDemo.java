package polymorphism;

public class MethodOverloadingDemo {

    int c=0;
    public static void main(String[] args) {
        MethodOverloadingDemo MethodOverloadingDemo = new MethodOverloadingDemo();
        MethodOverloadingDemo.add(1,2,9,0);
    }


    public void add(int i , int j){
        c=i+j;
    }

    public void add(int i,int j , int k){
        c = i+j+k;
    }

    public void add(int i,int j , int k,int l){
        c = i+j+k+l;
    }


}
