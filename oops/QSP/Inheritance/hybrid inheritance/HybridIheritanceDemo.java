class Animal{
    public void eat(){
        System.out.println("this animal eats foods");
    }
}
//single level inheritance

class Mammel extends Animal{
    public void giveBirth(){
        System.out.println("Mammels gives  lives birth");
    }
} 

//hierarchical inheritance
class Reptile extends Animal{
    public void layEggs(){
        System.out.println("Reptile lays eggs");
    }
}
// multi inheritance
class Dog extends Mammel{
    public void bark(){
        System.out.println("Dog barks");
    }
}
// mutli inheritance
class Snake extends Reptile{
    public void crawl(){
        System.out.println("Snake crawl");
    }
}   

public class HybridIheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.giveBirth();
        d.bark();

        System.out.println("----------");

        Snake s = new Snake();
        s.eat();
        s.layEggs();
        s.crawl();
    }
    
    
}