package datastructures.heaps;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);
        System.out.println(heap.getHeap());
        heap.insert(100);
        System.out.println(heap.getHeap());
        heap.insert(75);
        System.out.println(heap.getHeap());
        Heap heap2 = new Heap();
        heap2.insert(95);
        heap2.insert(75);
        heap2.insert(80);
        heap2.insert(55);
        heap2.insert(60);
        heap2.insert(50);
        heap2.insert(65);
        System.out.println(heap2.getHeap()); // 95, 75, 80, 55, 60, 50, 65
        heap2.removes();
        System.out.println(heap2.getHeap()); // 80, 75, 65, 55, 60, 50
        heap2.removes();
        System.out.println(heap2.getHeap()); // 75, 60, 65, 55, 50
    }
}
