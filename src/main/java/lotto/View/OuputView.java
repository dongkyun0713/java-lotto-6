package lotto.View;

import java.util.List;

public class OuputView {
    private static final String PURCHASE_LOTTO_MESSAGE = "d개를 구매했습니다.";
    private static final String WINNING_STATISTICS_MESSAGE = "당첨 통계\n---\n";
    private static final String MATCHES_3_MESSAGE = "3개 일치 (5,000원) -";
    private static final String MATCHES_4_MESSAGE = "4개 일치 (50,000원) -";
    private static final String MATCHES_5_MESSAGE = "5개 일치 (1,500,000원) -";
    private static final String MATCHES_5_BONUS_NUMBER_MESSAGE = "5개 일치, 보너스 볼 일치 (30,000,000원) -";
    private static final String MATCHES_6_MESSAGE = "6개 일치 (2,000,000,000원) -";
    private static final String WINING_COUNT_MESSAGE = " 개";


    public void ouputPurchaseLottoMessage(int lottoCount) {
        System.out.println(lottoCount + PURCHASE_LOTTO_MESSAGE);
    }

    public void outputWinningStatisticsMessage(List<Integer> countList) {
        System.out.printf(WINNING_STATISTICS_MESSAGE);
        System.out.println(MATCHES_3_MESSAGE + countList.get(0) + WINING_COUNT_MESSAGE);
        System.out.println(MATCHES_4_MESSAGE + countList.get(1) + WINING_COUNT_MESSAGE);
        System.out.println(MATCHES_5_MESSAGE + countList.get(2) + WINING_COUNT_MESSAGE);
        System.out.println(MATCHES_5_BONUS_NUMBER_MESSAGE + countList.get(4) + WINING_COUNT_MESSAGE);
        System.out.println(MATCHES_6_MESSAGE + countList.get(5) + WINING_COUNT_MESSAGE);
    }


}
