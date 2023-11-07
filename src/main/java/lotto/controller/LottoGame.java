package lotto.controller;

import camp.nextstep.edu.missionutils.Console;
import lotto.View.InputView;

public class LottoGame {
    private final InputView inputView = new InputView();
    public void start() {
        inputView.inputMoney();  // 구입 금액 입력

    }

}
