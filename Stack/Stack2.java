import java.util.Arrays;

public class Stack2 {
private int [] data;
private int capacity;
private int top=-1;

  
Stack2(){
	this(2);
}
Stack2(int size) {
	data = new int[size];
	capacity  = size;
	
}
boolean isEmpty() {
	return (top==-1);
}
int size() {
	return top+1;
}
void print() {
	if(isEmpty()) {
		System.out.println("Stack is Empty");
	}else
	System.out.println(" The Stack is :");
	for (int i = top; i > -1; i--) {
		System.out.println(" "+i+"-th Element "+data[i]+" ");
	}
}


void push(int value) {
	if(size()==data.length) {
		System.out.println(" Size doublled");
	int[] newData = new int [capacity*2];
	System.arraycopy(data, 0, newData, 0, capacity);
	data = newData;
	capacity =capacity*2;
	}
	top++;
	data[top]=value;
	
}
int cap() {
	return capacity;
}
public static void main(String[] args) {
	Stack2 st = new Stack2();
	st.push(2);
	st.push(2);
	st.push(2);
	st.push(2);
	st.push(2);
	st.push(2);
	st.push(2);
//
	System.out.println(" "+st.cap());

	st.print();
	
	System.out.println(" "+st.size());
	
	

	
}

}
