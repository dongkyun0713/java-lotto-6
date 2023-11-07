package lotto.controller;

import camp.nextstep.edu.missionutils.Console;

public class LottoGame {
    public void start() {
        System.out.println("구입금액을 입력해 주세요.");
        int purchaseAmount = Integer.parseInt(Console.readLine());
    }
}
