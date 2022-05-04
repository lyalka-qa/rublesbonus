public class Main {
    public static void main(String[] args) {
        int rublesOnAccount = 100;
        int addedRublesOnAccount = 1100;

//        int bonusRubles;
//        if (addedRublesOnAccount >= 1000) {
//            bonusRubles = addedRublesOnAccount / 100;
//        } else bonusRubles = 0;

        int bonusRubles = (addedRublesOnAccount >= 1000) ? (addedRublesOnAccount / 100) : 0;
        int finalSum = rublesOnAccount + addedRublesOnAccount + bonusRubles;

        System.out.println("Сумма на счету составляет:" + finalSum);
        System.out.println("Размер бонуса составляет:" + bonusRubles);
    }
}

