import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 1000);
    }

    @Test
    public void printerStartsWith100Sheets() {
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void printerStartsWith1000TonerVolume() {
        assertEquals(1000, printer.getTonerVolume());
    }

    @Test
    public void printerDoesNotHaveEnoughPaper() {
        assertFalse(printer.hasEnoughPaper(11, 10));
    }

    @Test
    public void printerHasEnoughPaper() {
        assertTrue(printer.hasEnoughPaper(1, 10));
    }

    @Test
    public void printerDoesNotHaveEnoughToner() {
        assertFalse(printer.hasEnoughToner(100, 11));
    }

    @Test
    public void reducesNumberOfSheetsWhenPrinting() {
        printer.print(1, 10);
        assertEquals(90, printer.getNumberOfSheets());
    }

    @Test
    public void reducesTonerWhenPrinting() {
        printer.print(10, 1);
        assertEquals(990, printer.getTonerVolume());
    }

}
