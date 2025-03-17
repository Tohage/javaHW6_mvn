import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTests {

    int[] salesInMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();

        long actual = service.sumSales(salesInMonth);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSalesAmount() {
        StatsService service = new StatsService();

        long actual = service.averageSalesAmount(salesInMonth);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthMaxSales() {
        StatsService service = new StatsService();

        int actual = service.numMonthMaxSales(salesInMonth);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthMinSales() {
        StatsService service = new StatsService();

        int actual = service.numMonthMinSales(salesInMonth);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAmountMountSalesBelowAverage() {
        StatsService service = new StatsService();

        int actual = service.amountMountSalesBelowAverage(salesInMonth);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAmountMountSalesAboveAverage() {
        StatsService service = new StatsService();


        int actual = service.amountMountSalesAboveAverage(salesInMonth);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}