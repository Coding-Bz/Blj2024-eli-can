public class CustomStack {

        private String [] stackArray;
        int top;
        int capacity;
        int check;
        int size;

        public CustomStack(int capacity){
            this.capacity=capacity;
            this.stackArray =new String[capacity];
            this.top=-1;
            this.check=-1;
this.size=0;
        }
    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==capacity-1;
    }
    public void pushData(String[]userArray){
        System.out.println("--- Adding new data ---");
        if(isFull()){
            System.out.println("The capacity is full!");
            return;
        }
        for (int i=0; i<userArray.length; i++){
            size++;
            check++;
            top=top+1;
            stackArray[top] =userArray[i];
            System.out.println(stackArray[top].toString()+" and the number: "+top+" check: "+check);
        }

        System.out.println("The size is: "+size);
    }

    public void popData(){
        if (isEmpty()){
            System.out.println("Not found any data to remove!");
            return;
        }
        top--;
    }
    public void calculateSolution(){

int think=size/2;
int c=top;

        System.out.println(think);

        System.out.println(stackArray[top]);
        for (int j=0;j<think+1; j++){
           c--;
        }
        System.out.println(stackArray[c]);
int first=(int)stackArray[c];

    }



}
