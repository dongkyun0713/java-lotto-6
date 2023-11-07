package lotto.winning;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinningNumber {
    public int countWinningNumber(List<Integer> winningNumber, List<Integer> inputNumber) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (winningNumber.contains(inputNumber.get(0))) count++;
        }
        return count;
    }

    public List<Integer> save(int count) {
        int[] winningStatistics = {0, 0, 0, 0, 0};
        if (count - 3 >= 0) winningStatistics[count - 3] += 1;
        return Arrays.stream(winningStatistics)
                .boxed().
                collect(Collectors.toList());
    }
}
