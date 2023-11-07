package lotto.View;

public class OuputView {
    private static final String PURCHASE_LOTTO_MESSAGE = "\n%d개를 구매했습니다.\n";

    public void ouputPurchaseLottoMessage(int lottoCount){
        System.out.printf(PURCHASE_LOTTO_MESSAGE, lottoCount);
    }
}
