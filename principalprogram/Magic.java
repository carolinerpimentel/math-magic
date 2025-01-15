package principalprogram;

public class Magic {
    public static void main(String[] args) {
        int myNumber = 100;
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;

        System.out.println(magicNumber);
    }
}
