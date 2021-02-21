package org.csystem.app.samples.numericlotto;

import org.csystem.util.ArrayUtil;

import java.util.Scanner;

public class NumericLottoApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        NumericLotto lotto = new NumericLotto();

        for (;;) {
            System.out.print("Kaç kupon oynamak istersin?");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            for (int i = 0; i < n; ++i)
                ArrayUtil.display(2, lotto.getNumbers());
        }
    }
}
