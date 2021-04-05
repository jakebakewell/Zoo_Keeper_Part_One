public class Gorilla extends Mammal {
    public Gorilla(){
    }
    public void throwSomething() {
        System.out.println("The gorilla has thrown something.");
        energy -= 5;
    }
    public void eatBananas() {
        System.out.println("The gorilla ate a banana. It is satisfied.");
        energy += 10;
    }
    public void climb() {
        System.out.println("The gorilla climbed a tree.");
        energy -= 10;
    }
}