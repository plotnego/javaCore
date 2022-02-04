package com.company;

public class Dog {
    public String name;
    private String breed;
    private int age;

    public enum breed{
        POODLE("Пудель"),
        HUSKY("Хаски"),
        CHIHUAHUA("Чихуахуа"),
        PUG("Мопс");

        public String getNameOfBreed() {
            return nameOfBreed;
        }

        private String nameOfBreed;

        breed(String nameOfBreed){
            this.nameOfBreed=nameOfBreed;
        }

    }

    public Dog(String name, breed breed, int age) {
        this.name = name;
        this.breed = breed.nameOfBreed;
        this.age = age;
    }

    public Dog() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   static void oldestDog(Dog... dogs){
        Dog oldest = new Dog();
        oldest.setAge(0);
        for(Dog dog : dogs){
            if(dog.age>oldest.age) oldest = dog;
        }
        System.out.println("Самая старая собака : "+oldest.getName()+"\nПорода : "+oldest.getBreed());

    }

    public boolean equalsName(Dog dog){
        if(this == dog) return true;
        if(this == null) return false;
        if(getClass() != dog.getClass()) return false;
        Dog eq = (Dog) dog;
        if (name == null) {
            if(eq.name !=null) return false;
        } else if (!name.equals(eq.name)) return false;

        return true;
    }
}


