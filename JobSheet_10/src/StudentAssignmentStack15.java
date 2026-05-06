public class StudentAssignmentStack15  {
    Student15[] stack;
    int top, size;

    StudentAssignmentStack15 (int size) {
        this.size = size;
        top = -1;
        stack = new Student15[size];
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Student15 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    Student15 pop() {
        if (!isEmpty()) {
            Student15 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    Student15 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
        }
        System.out.println("");
    }

    //modify number 5
    Student15 peekFirst() { 
        if(!isEmpty()) { 
            return stack[0]; 
        } else { 
            System.out.println("There is no data in Stack!!");
            return null; 
        } 
    }

    //modify number 6
    int count(){
        return top +1;
    }

    //pratikum 2
    String convertToBinary(int grade) {
        ConversionStack15 stack = new ConversionStack15();
        while (grade > 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }
}