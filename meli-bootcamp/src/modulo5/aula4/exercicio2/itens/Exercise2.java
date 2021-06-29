package modulo5.aula4.exercicio2.itens;

class Counter {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void up() {
        count++;
    }

    public void down() {
        count--;
    }

    public Counter() {}

    public Counter(int initialValue) {
        this.count = initialValue;
    }

    public Counter(Counter counter) {
        this.count = counter.count;
    }
}

public class Exercise2 {
    public static void exec() {
        Counter c1 = new Counter();
        Counter c2 = new Counter(10);
        Counter c3 = new Counter(c2);

        c1.up();
        c2.down();
        c3.up();

        System.out.println("Contador 1: " + c1.getCount());
        System.out.println("Contador 2: " + c2.getCount());
        System.out.println("Contador 3: " + c3.getCount());
    }
}
