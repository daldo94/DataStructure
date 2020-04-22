

public class DataStructureMain {
    public static void main(String[] args) {
        //ArrayList
        /*
        ArrayList<Integer> testArray = new ArrayList<>();

        testArray.add(31);
        testArray.add(42);
        testArray.add(52);

        System.out.println(testArray.size());

        testArray.add(31);
        testArray.add(42);
        System.out.println(testArray.size());

        testArray.add(42);
        testArray.add(52);
        System.out.println(testArray.size());

        System.out.println(testArray.indexOf(52));
        testArray.delete((Integer)52);
        testArray.delete(0);
        System.out.println(testArray.indexOf(52));
        */

        //SimpleLinkedList
        /*
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();

        list.add(100);
        list.add(200);
        list.add(400);
        list.add(500);
        System.out.println(list);

        list.add(2,300);
        list.addFirst(50);
        System.out.println(list);

        System.out.println(list.get(4));

        list.remove(2);
        list.remove(new Integer(400));
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println("크기 : " + list.size());
        */

        //DoublyLinkedList
        /*
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.addFirst(60);
        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(10);
        System.out.println(list.toString());

        list.add(1,20);
        System.out.println(list.toString());

        list.addLast(80);
        System.out.println(list.toString());

        list.removeFirst();
        System.out.println(list.toString());

        list.removeLast();
        System.out.println(list.toString());

        list.remove(2);
        System.out.println(list.toString());
        */


        //CircularLinkedList
/*
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.delete(2);
        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
        System.out.println(list.toString());
        System.out.println(list.size());

        list.add(2, 999);
        System.out.println(list.toString());
        System.out.println(list.size());


        list.addLast(60);
        list.addLast(70);
        System.out.println(list.toString());
        System.out.println(list.size());

        list.add(2,45);
        System.out.println(list.toString());
        System.out.println(list.size());

        list.deleteFirst();
        System.out.println(list.toString());
        System.out.println(list.size());
        list.deleteLast();
        System.out.println(list.toString());
        System.out.println(list.size());
        list.delete(2);
        System.out.println(list.toString());
        System.out.println(list.size());
        */

        //DoublyCircularLinkedList
/*
        DoublyCircularLinkedList<Integer> list = new DoublyCircularLinkedList<>();

        list.addFirst(3);
        list.addLast(5);
        System.out.println(list.toString());
        System.out.println(list.size());
        list.add(1,4);
        System.out.println(list.toString());
        System.out.println(list.size());

        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        System.out.println(list.toString());
        System.out.println(list.size());

        list.deleteFirst();
        System.out.println(list.toString());
        System.out.println(list.size());

        list.deleteLast();
        System.out.println(list.toString());
        System.out.println(list.size());

        list.delete(1);
        System.out.println(list.toString());
        System.out.println(list.size());

        list.delete(1);
        System.out.println(list.toString());
        System.out.println(list.size());
*/
/*
        //Stack
        Stack<String> stack = new Stack<>(3);

        stack.push("test1");
        stack.push("test2");
        stack.push("test3");
        stack.printStack();

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.printStack();

        stack.delete();
        stack.printStack();
*/

        //Queue
        Queue<String> q = new Queue<>(3);
        q.push("test1");
        q.push("test2");
        q.printQueue();
        q.push("test3");
        q.printQueue();
        q.push("test4");
        q.printQueue();
        System.out.println(q.pop());
        q.printQueue();
        q.push("test5");
        q.printQueue();
        q.push("test6");
        q.printQueue();

        System.out.println(q.peak());
        q.pop();
        System.out.println(q.peak());
        q.pop();
        q.pop();
        q.printQueue();

        q.push("test7");
        q.printQueue();
    }
}
