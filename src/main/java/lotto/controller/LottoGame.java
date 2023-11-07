package lotto.controller;

import camp.nextstep.edu.missionutils.Console;
import lotto.View.InputView;
import lotto.View.OuputView;
import lotto.domain.Purchase;

public class LottoGame {
    private final InputView inputView = new InputView();
    private final OuputView outputView = new OuputView();
    private final Purchase purchase = new Purchase();
    public void start() {
        purchaseLotto();

    }

    public void purchaseLotto() {
        int purchaseCount = purchase.countPurchaseLotto(inputView.inputMoney());
        outputView.ouputPurchaseLottoMessage(purchaseCount);
    }
}
