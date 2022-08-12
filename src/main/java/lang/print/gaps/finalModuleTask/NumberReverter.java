package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int resultNumber = 0;
        for (int i = number; i !=0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        System.out.println(resultNumber);

    }
}
