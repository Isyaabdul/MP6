//Declaring the Class
public class AnimalHierachy {

    public static void main(String[] args) {

        //Declaring the Animals in the food chain
        Bird bird = new Bird();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        //The role of the bird in the food chain
        System.out.println("Bird behavior:");
        bird.flee();
        bird.hunt();

        //The role of the Cat in the food chain
        System.out.println("\nCat behavior:");
        cat.flee();
        cat.hunt();

        //The role of the Wolf in the food chain
        System.out.println("\nWolf behavior:");
        wolf.flee();
        wolf.hunt();

    }

}