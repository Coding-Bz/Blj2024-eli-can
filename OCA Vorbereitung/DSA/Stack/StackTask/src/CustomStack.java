public class CustomStack {
    private String [] stackArray;
    int top;
    int capacity;
int check;

    public CustomStack(int capacity){
        this.capacity=capacity;
        this.stackArray =new String[capacity];
        this.top=-1;
        this.check=-1;

    }
    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==capacity-1;
    }

    public void pushData(String data){
        check++;
        if(isFull()){
            System.out.println("The capacity is full!");
            return;
        }

        top=top+1;
        stackArray[top]=data;
        System.out.println(stackArray[top]+" and the number: "+top+" check: "+check);
    }


    public void popData(){
        if (isEmpty()){
            System.out.println("Not found any data to remove!");
            return;
        }
        top--;
    }

    public void stepBack(){
        System.out.println();
        System.out.println("---Going back---");
        System.out.println();


try {
    if (stackArray[check-1]==null){
        System.out.println("Going back is not possible.");
        System.out.println();
        return;
    }
}catch (ArrayIndexOutOfBoundsException e){

}

try {
    check--;
    System.out.print("Result: "+stackArray[check]);
    System.out.println();
}catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Not possible "+e.getMessage());
}


    }

    public void stepForward(){
        System.out.println();
        System.out.println("---Going Forward---");
        System.out.println();

        try {
            if (stackArray[check+1]==null){
                System.out.println("Going forward is not possible.");
                return;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Not possible "+e.getMessage());
            System.out.println();
        }
        if (check==0){
            check++;
        }

        try {
            check++;
            System.out.print("Result: "+stackArray[check]);
            System.out.println();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Not possible "+e.getMessage());
        }}


    public void deletingEverything(){
        System.out.println();
        while (!isEmpty()){
            System.out.println();
            popData();
        }
        popData();


        if (isEmpty()){
            System.out.println("Everthing removed!");
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("No data to show!");
            return;
        }
        System.out.print(stackArray[top]);
    }

    public void search(String data){
        System.out.println();
        System.out.println("--- Specific Search in history ---");
        System.out.println();
        System.out.println("The search for: "+data+" has started!");
        if (stackArray[top].equalsIgnoreCase(data)){
            System.out.println(stackArray[top]);
            return;
        }
        else {
            while (!isEmpty()){
                if (stackArray[top].equalsIgnoreCase(data)){
                    System.out.println("The data was found!");
                    System.out.println("Data name: "+stackArray[top]);}
                popData();
            }

        }


    }
}



