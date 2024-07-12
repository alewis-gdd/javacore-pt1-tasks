class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here
        String tempName;
        int tempAge;

        tempName = p1.getName();
        tempAge = p1.getAge();

        p1.setName(p2.getName());
        p1.setAge(p2.getAge());

        p2.setName(tempName);
        p2.setAge(tempAge);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Shemar McKnight", 23);
        Person p2 = new Person("Sandra Bullock", 47);

        System.out.println("###Attributes Before Swap###\n");
        System.out.println("P1 Name: " + p1.getName() + " | P1 Age: " + p1.getAge());
        System.out.println("P2 Name: " + p2.getName() + " | P2 Age: " + p2.getAge());

        changeIdentities(p1, p2);

        System.out.println("\n-------------------------------\n");
        System.out.println("###Attributes After Swap###\n");
        System.out.println("P1 Name: " + p1.getName() + " | P1 Age: " + p1.getAge());
        System.out.println("P2 Name: " + p2.getName() + " | P2 Age: " + p2.getAge());

    }
}
