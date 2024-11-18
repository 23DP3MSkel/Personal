package Java_mooch_files;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count += 1;
        this.sum += number;

    }

    public int getCount() {
        return this.count;
    }

    public int sum(){
        return sum;
    }

    public double average(){
        return (double) this.sum/this.count;
    }
}
