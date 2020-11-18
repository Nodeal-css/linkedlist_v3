public class MainDriver {
    public static void main(String[] args){
        Linkedlist persons = new Linkedlist();
        persons.addFirst("inoc", 20);
        persons.addFirst("Vince", 21);
        persons.addFirst("Philip", 18);
        persons.addFirst("Obiedo", 20);

        //option 1 
        persons.addLast(new Person("Ellen", 22));
        //option 2
        Person newperson = new Person("Harold", 22);
        persons.addLast(newperson);
        persons.displayPerson();

        System.out.println("Deleting position 2");
        persons.deleteAtPosition(-1);
        persons.displayPerson();

    }
}
