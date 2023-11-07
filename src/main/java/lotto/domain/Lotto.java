package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private static final int LOTTO_SIZE_SIX = 6;
    private static final String ERROR_MESSAGE_IllegalArgumentException = "[ERROR] 로또 번호는 6개의 숫자여야 합니다.";

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != LOTTO_SIZE_SIX) {
            throw new IllegalArgumentException(ERROR_MESSAGE_IllegalArgumentException);
        }
    }
    // TODO: 추가 기능 구현

    private List<Integer> sortAsc(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }



}
