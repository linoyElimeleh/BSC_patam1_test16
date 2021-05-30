package test;

import java.util.ArrayList;

public class MyIntegerBuilder {

    // ----------- do not change --------
    ArrayList<Character> buff;

    public MyIntegerBuilder() {
        buff = new ArrayList<>();
    }

    public MyIntegerBuilder(char... ts) {
        buff = new ArrayList<>();
        for (char t : ts)
            buff.add(t);
    }

    //----------------------------------
    public MyIntegerBuilder append(String numbers) throws Exception {
        try {
            int intNumbers = Integer.parseInt(numbers);
            ArrayList<Integer> arrayDigit = new ArrayList<>();

            do {
                arrayDigit.add(intNumbers % 10);
                intNumbers /= 10;
            } while (intNumbers > 0);

            int REDIX = 10;
            for (int i = arrayDigit.size() - 1; i >= 0; i--) {
                char c = Character.forDigit(arrayDigit.get(i), REDIX);
                buff.add(c);
            }

        } catch (Exception e) {
            throw new Exception("the string must digits an only digits");
        }
        return this;

    }

    public int toInt() {
        String str = buff.stream().map(e -> e.toString()).reduce((acc, e) -> acc + e).get();

        return Integer.parseInt(str);
    }

    public MyIntegerBuilder reverse() {
        ArrayList<Character> arrayDigit = new ArrayList<>();
        for (int i = buff.size() - 1; i >= 0; i--) {
            arrayDigit.add(buff.get(i));
        }
        buff = arrayDigit;

        return this;
    }
}
