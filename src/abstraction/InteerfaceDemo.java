package abstraction;

interface AnimalInterface {

    public abstract void sound();

}

public class InteerfaceDemo {

    public static void main(String[] args) {

        DogInterface dogInterface = new DogInterface();
        dogInterface.sound();
        CatInterface catInterface = new CatInterface();
        catInterface.sound();
    }
}

class DogInterface implements AnimalInterface {

    @Override
    public void sound() {
        System.out.println("Dog sound....");
    }
}

class CatInterface implements AnimalInterface {

    @Override
    public void sound() {
        System.out.println("Mauu...");
    }
}
// normal two or more
// functional only one
// marker no method