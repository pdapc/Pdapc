public  class Cat extends Animal{

    public Cat (String name) {
        super(name);
    }

    @Override
    public void talk(){
        System.out.println("喵說");
    }


    @Override
    public void eat(){
        System.out.println("喵吃");
    }


    @Override
    public void mating(Animal animal){
        System.out.println("喵交");
    }
}

