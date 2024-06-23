public class person {
    private String name;
    private int age;
    private String address;
    
    // function to set the name and return the Person object
    public person setName(String name) {
        this.name = name;
        return this;
    }
    
    // function to set the age and return the Person object
    public person setAge(int age) {
        this.age = age;
        return this;
    }

    // function to set the address and return the Person object
    public person setAddress(String address) {
        this.address = address;
        return this;
    }
    
    // function to display the details of the Person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
       
    }

    public static void main(String[] args) {
        // Create a new Person object and chain method calls
        person person = new person()
                .setName("rathan")
                .setAge(22)
                .setAddress("banglore");
                

        // Display the details of the person
        person.displayDetails();
    }
}
