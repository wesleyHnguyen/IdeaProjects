import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;

public class EdibleTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal: animals) {
            System.out.println(animal.makeSound());

            if(animal instanceof Chicken){
                Edible chicken = (Chicken)animal;
                System.out.println(((Edible)chicken).howToEat());
            }

        }
    }
}
