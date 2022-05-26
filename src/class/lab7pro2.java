public class lab7pro2{
    public static void main(String[] args) {
        int[] my_arr = {23, 56, 34, 234, 1};
        A a = new A(my_arr);
        B b = new B(my_arr);
        C c = new C(my_arr);
        
        a.start();
        b.start();
        c.start();
    }
}

class A extends Thread {
    int[] my_arr;
    A (int[] arr) {
        my_arr = arr;
    }
    @Override
    public void run() {
        int sum = 0;
        for (int i=0;i<my_arr.length;i++) {
            sum += my_arr[i];
        }
        System.out.println("Array sum: "+ sum);
    }
}

class B extends Thread {
    int[] my_arr;
    B (int[] arr) {
        my_arr = arr;
    }
    @Override
    public void run() {
        int max = my_arr[0];
        for (int i=0;i<my_arr.length;i++) {
            if(my_arr[i]>max)
                max = my_arr[i];
        }
        System.out.println("Max element: "+ max);
    }
}

class C extends Thread {
    int[] my_arr;
    C (int[] arr) {
        my_arr = arr;
    }
    @Override
    public void run() {
        int min = my_arr[0];
        for (int i=0;i<my_arr.length;i++) {
            if(my_arr[i]<min)
                min = my_arr[i];
        }
        System.out.println("Min element: "+ min);
    }
}
