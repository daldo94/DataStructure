

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
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.delete(2);
        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
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


    }
}