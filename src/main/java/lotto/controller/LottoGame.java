package lotto.controller;

import camp.nextstep.edu.missionutils.Console;
import lotto.View.InputView;
import lotto.View.OuputView;

public class LottoGame {
    private final InputView inputView = new InputView();
    private final OuputView outputView = new OuputView();
    public void start() {
        inputView.inputMoney();  // 구입 금액 입력

    }

}
