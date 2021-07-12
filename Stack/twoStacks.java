 class towStacksArr {
    int[] arr;
    int cap;
    int top1;
    int top2;
  towStacksArr(int n)
    {
        cap = n;
        top1 = -1;
        top2 = n;
        arr = new int[n];
    }
    void push1 (int x){
        if(top1<top2-1){
            top1++;
            arr[top1] = x;
        }
    }
    void push2 ( int x){
       if (top1 < top2-1){
           top2-- ;
           arr[top2] = x;
       }
    }
    int pop1(){
        if(top1 >=0) {
            int x = arr[top1];
            top1--;
            return x;
        }
            else {
            System.out.println("Stack Underflow");
                System.exit(1);
        }
            return 0;

    }
    int pop2(){
       if(top2<cap){
           int x = arr[top2];
           top2 ++;
           return x;
       }
       else {
           System.out.println("Stack Underflow");
           System.exit(1);
       }
        return 0;
    }
    public static class Stack{
        public static void main(String[] args) {
            towStacksArr s = new towStacksArr(5);
            s.push1(2);
            s.push2(5);
            s.push2(30);
            s.push1(40);
            s.push1(50);
            System.out.println("Popped element = " +s.pop1());
            s.push2(100);
            System.out.println("Popped element 2  =" +s.pop2());
        }
    }

}
//Time complexity = O(1) because we donot waste a single auxilary space.
