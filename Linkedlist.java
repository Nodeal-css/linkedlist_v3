public class Linkedlist {
    private Person head;

    private Person newPerson(String name, int age) {
        return new Person(name, age);
    }

    public void addFirst(String name, int age) {
        Person newperson = newPerson(name, age);
        if (head == null) {
            head = newperson;
        } else {
            newperson.next = head;
            head = newperson;
        }
    }

    public void addLast(Person p){
        Person newperson = newPerson(p.name, p.age);
        if(head == null){
            head = newperson; 
        } else {
            Person temp = head;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = newperson;
        }
    }

    public void deleteAtPosition(int position){
        if(head == null){
            return;
        } else if( position < 0 || position > getLength()-1){
            return;
        }
        
        Person temp = head;
        Person prev = null;
        for(int i = 0; i< position; i++){
            prev = temp;
            temp = temp.next;		
        }
        prev.next = temp.next;
        temp.next = null;
        
    }

    public int getLength(){
        int len = 0;
        Person temp = head;
        while(temp !=null){
            len++;
            temp = temp.next;
        }
        return len;
    }


    public void displayPerson(){
        Person temp = head;
        while(temp != null){
            System.out.println("name: "+temp.name+", age:"+temp.age);
            temp = temp.next;
        }
        System.out.println("null");
    }
}
