package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RandomLottoNumberGenerator {
    public List<Integer> RandomLottoNumberGenerator() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}
