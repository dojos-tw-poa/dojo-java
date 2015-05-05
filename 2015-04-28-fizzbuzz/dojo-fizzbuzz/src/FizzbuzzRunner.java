
public class FizzbuzzRunner {
    Fizzbuzz fizzbuzz;

    public FizzbuzzRunner(Fizzbuzz fizzbuzz) {
        this.fizzbuzz = fizzbuzz;
    }

    public void run(int times) {
        for (int counter=1; counter <= times; counter++) {
            System.out.println(fizzbuzz.transform(counter));
        }
    }
}
