package control_statement;


public class DoWhileLoop {

    public static void main(String[] args) {

//       int i =(int) (Math.random()*100+1);
        int i = 7;
        while (i<=10) {
            System.out.println("i is positive");
            i++;
        }

//        while(true){
//            System.out.println("infinite");
//        }

        do {
            System.out.println("i");
            i++;
        }while (i<=10);

    }
}
