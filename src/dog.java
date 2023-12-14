class dog extends Animal{
    String breed;
    
    public dog(String name,String breed){
        super(name);
        this.breed=breed;
    }
    public void isBreeding(){
        System.out.println(name + " is eating " +"than "+ breed);
    }
}