public  class Dog extends Animal{

    public Dog (String name) {
        super(name);
    }

    @Override
    public void talk(){
        System.out.println("汪說");
    }


    @Override
    public void eat(){
        System.out.println("汪吃");
    }


    @Override
    public void mating(Animal animal){
        System.out.println("汪交");
    }

















}
