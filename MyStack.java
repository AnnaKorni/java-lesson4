package v2.Seminar4.Homework4;
//Реализуйте MyStack с использованием LinkedList с методами:
//        ● push(String element) - добавляет элемент на вершину стека
//        ● pop() - возвращает элемент с вершины и удаляет его
//        ● peek() - возвращает элемент с вершины, не удаляя
//        ● getElements() - возвращает все элементы   стека


import java.util.LinkedList;

public class MyStack {
    private LinkedList<String> stack = new LinkedList<>();

    public void push(String element) {
        stack.addFirst(element);
    }

    public String pop() {
        return stack.removeFirst();
    }

    public String peek() {
        return stack.peekFirst();
    }

    public LinkedList<String> getElements() {
        return new LinkedList<>(stack);
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
            stack.push("apple");
            stack.push("banana");
            stack.push("pear");
            stack.push("grape");
        } else {
            for (String arg : args) {
                stack.push(arg);
            }
        }
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());

    }
}