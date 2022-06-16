public class Stack {
private int capacity;
private int[] data;
private int top=-1;

Stack(){
data = new int[capacity];	
}

Stack(int size) {
	data = new int[size];
	capacity = size;
}

boolean isEmpty() {
	return (top==-1);
}

int size() {
	return top+1;
}

void print() {
	System.out.println(" The Stack is :");
	for (int i = top; i > -1; i--) {
		System.out.println(" "+i+"-th Element "+data[i]+" ");
	}
}

void push(int value) {
	if(size()==data.length) {
		System.out.println("Stack Overflow");
	}
	else
	    top++;
		data[top]=value;
}



int pop() {
	if(isEmpty()) {
		System.out.println("Stack is Empty");
}
	int topVal = data[top];
	top--;
	return topVal;
}



void top() {
if (isEmpty()) {
System.out.println("Stack is Empty"); 
}
else
System.out.println(" "+data[top]);

}



public static void main(String[] args) {
	Stack st = new Stack(10);
	st.push(2);
	st.push(5);
	st.push(8);
	st.push(4);
	st.push(3);
	st.push(0);

	System.out.println(" "+st.pop());
	System.out.println(" "+st.size());
	st.top();


	st.print();
	
	
}

}
