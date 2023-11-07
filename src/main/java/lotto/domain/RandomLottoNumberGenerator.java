package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RandomLottoNumberGenerator {
    private static final int MIN_NUMBER_ONE = 1;
    private static final int MAX_NUMBER_FORTY_FIVE = 45;
    private static final int LOTTO_NUMBER_COUNT_SIX = 6;

    public List<Integer> randomLottoNumberGenerator() {
        return Randoms.pickUniqueNumbersInRange(MIN_NUMBER_ONE, MAX_NUMBER_FORTY_FIVE, LOTTO_NUMBER_COUNT_SIX);
    }
}
