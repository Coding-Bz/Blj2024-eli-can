package Task_2;

public class Department {

    private String name;
    private String head;

    public Department(String name, String head){
        this.name=name;
        this.head=head;
    }


    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
