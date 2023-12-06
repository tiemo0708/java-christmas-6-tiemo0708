package christmas.domain;

public class Badge {
    private static final String SANTA = "산타";
    private static final String TREE="트리";
    private static final String STAR="별";
    private static final String NONE = "없음";

    private static final int SANTA_AMOUNT=20_000;
    private static final int TREE_AMOUNT=10_000;
    private static final int STAR_AMOUNT=5_000;

    public static String makeBadge(int discountSum) {

            if(discountSum>=SANTA_AMOUNT){
                return SANTA;
            }
            if (discountSum>=TREE_AMOUNT){
                return TREE;
            }
            if(discountSum>=STAR_AMOUNT){
                return STAR;
            }
            return NONE;

    }
}
