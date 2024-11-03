package app.model;

import app.enumHelper.Day;
import app.sevice.AdviceService;

public class AdviceGenerator implements AdviceService {

    @Override
    public void advice(Day day) {

        switch (day) {
            case MONDAY:
                System.out.println("Понеділок - це не вирок! " +
                        "Це просто день, коли кава смакує особливо солодко." +
                        " А ще, можна почати день з танцю з пилососом - заряджає позитивом!");
                break;
            case TUESDAY:
                System.out.println("Вівторок - це середина тижня, а значить, " +
                        "ти вже наполовину досяг успіху! Щоб до кінця дійти, можна " +
                        "спробувати працювати лежачи - раптом, так ефективніше?");
                break;
            case WEDNESDAY:
                System.out.println("Середа - день для експериментів! " +
                        "Спробуй вирішувати задачі, стоячи на голові. Або ж, " +
                        "просто мрій про вихідні. Це теж продуктивно!");
                break;
            case THURSDAY:
                System.out.println("Четвер - це передсмак вихідних! " +
                        "Щоб не зірватися з режиму, можна почати збирати валізу на вихідні. " +
                        "Або ж, просто порахувати, скільки днів залишилося до п'ятниці.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
                System.out.println("Вирушай на пошуки скарбів! " +
                        "Ні, не піратських, а просто сходь у книгарню або на блошиний ринок.");
                break;
            case SUNDAY:
                System.out.println("Вирушай на пікнік або прогулянку парком. " +
                        "А якщо погода не дозволяє, то влаштуй пікнік вдома - на дивані.");
                break;

        }
    }
}
