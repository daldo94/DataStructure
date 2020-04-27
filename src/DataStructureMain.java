import deque.ArrayDeque;
import deque.Deque;
import deque.ListDeque;
import graph.AdjMatrixGraph;
import graph.Graph;
import list.DoublyLinkedList;

public class DataStructureMain {
    public static void main(String[] args) {
        //List.ArrayList
        /*
        List.ArrayList<Integer> testArray = new List.ArrayList<>();

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

        //List.SimpleLinkedList
        /*
        List.SimpleLinkedList<Integer> list = new List.SimpleLinkedList<>();

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

        //List.DoublyLinkedList
        /*
        List.DoublyLinkedList<Integer> list = new List.DoublyLinkedList<>();

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


        //List.CircularLinkedList
/*
        List.CircularLinkedList<Integer> list = new List.CircularLinkedList<>();
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

        //List.DoublyCircularLinkedList
/*
        List.DoublyCircularLinkedList<Integer> list = new List.DoublyCircularLinkedList<>();

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
        //stack.Stack
        stack.Stack<String> stack = new stack.Stack<>(3);

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
/*
        //queue.Queue
        queue.Queue<String> q = new queue.Queue<>(3);
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
 */
        //queue.CircularQueue
        /*
        queue.CircularQueue<String> queue = new queue.CircularQueue<>(4);

        queue.push("test1");
        queue.printQueue();

        queue.push("test2");
        queue.printQueue();

        queue.push("test3");
        queue.printQueue();

        queue.push("test4");
        queue.printQueue();


        System.out.println(queue.peak());
        System.out.println(queue.size());
        System.out.println(queue.pop());
        queue.printQueue();
        System.out.println(queue.size());


        queue.push("test5");
        queue.printQueue();
        queue.push("test6");
        System.out.println(queue.size());

        System.out.println(queue.pop());
        queue.printQueue();
        System.out.println(queue.peak());
*/
        //Array Deque
        /*
        ArrayDeque<String> arrayDeque = new ArrayDeque<>(4);
        arrayDeque.push_front("test1");
        arrayDeque.push_front("test2");
        arrayDeque.printDeque();
        arrayDeque.pop_back();
        arrayDeque.printDeque();
        arrayDeque.push_back("test3");
        arrayDeque.printDeque();
        arrayDeque.push_front("test4");
        arrayDeque.printDeque();
        System.out.println(arrayDeque.front());
        System.out.println(arrayDeque.back());
        System.out.println(arrayDeque.size());
        arrayDeque.pop_front();
        arrayDeque.printDeque();
        arrayDeque.push_front("test4");
        arrayDeque.push_front("test5");
        arrayDeque.push_front("test6");
        arrayDeque.printDeque();
        */

        //ListDeque
/*
        Deque<String> listDeque = new ListDeque<>();
        listDeque.push_front("test1");
        listDeque.push_front("test2");
        listDeque.printDeque();
        listDeque.push_back("test3");
        listDeque.push_back("test4");
        listDeque.printDeque();

        System.out.println(listDeque.front());
        System.out.println(listDeque.back());

        System.out.println(listDeque.pop_front());
        listDeque.printDeque();
        System.out.println(listDeque.pop_back());
        listDeque.printDeque();
        listDeque.push_back("test9");
        listDeque.printDeque();
        System.out.println(listDeque.back());
        System.out.println(listDeque.pop_back());
        listDeque.printDeque();
        System.out.println(listDeque.pop_back());
        listDeque.printDeque();
        System.out.println(listDeque.front());
        System.out.println(listDeque.pop_back());

        listDeque.printDeque();
        listDeque.push_front("test10");
        listDeque.printDeque();
        listDeque.push_back("test11");
        listDeque.printDeque();
        System.out.println(listDeque.front() + " " + listDeque.back());
        listDeque.push_front("test12");
        listDeque.printDeque();
        listDeque.push_back("test13");
        listDeque.printDeque();*/

        Graph graph = new AdjMatrixGraph(3);

        graph.printGraph();
        graph.addEdge(1,3);
        graph.printGraph();
        System.out.println(graph.isLinked(1,2));
        graph.addEdge(2,3);
        graph.printGraph();
        graph.deleteEdge(2,3);
        graph.printGraph();
    }
}
