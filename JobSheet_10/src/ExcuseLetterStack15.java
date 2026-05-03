public class ExcuseLetterStack15 {
    ExcuseLetter15[] stack;
    int top, size;

    public ExcuseLetterStack15(int size) {
        this.size = size;
        stack = new ExcuseLetter15[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(ExcuseLetter15 letter) {
        if (!isFull()) {
            top++;
            stack[top] = letter;
        } else {
            System.out.println("The stack is full!");
        }
    }

    public ExcuseLetter15 pop() {
        if (!isEmpty()) {
            ExcuseLetter15 letter = stack[top];
            top--;
            return letter;
        } else {
            System.out.println("The stack is empty!");
            return null;
        }
    }

    public ExcuseLetter15 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("The stack is empty!");
            return null;
        }
    }

    public void searchByName(String searchName) {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return;
        }
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].name.equalsIgnoreCase(searchName)) {
                System.out.println("Letter Found!");
                System.out.println("ID: " + stack[i].id + ", Name: " + stack[i].name + 
                                   ", Class: " + stack[i].className + 
                                   ", Type: " + stack[i].typeOfExcuse + 
                                   ", Duration: " + stack[i].duration + " days");
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Letter for student " + searchName + " not found.");
        }
    }
}