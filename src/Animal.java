class Animal {
    public void eat(){
        System.out.println("Omnivorous diet!");
    }

}

class Lion extends Animal{
    @Override
    public void eat() {
        System.out.println("Carnivorous diet!");
    }
}

class Test{
    public static void main(String[] args) {
        Animal a = new Lion();
        a.eat();
    }
}