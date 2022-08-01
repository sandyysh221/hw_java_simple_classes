public class Printer {
    private int numberOfSheets;
    private int tonerVolume;

    public Printer(int numberOfSheets, int tonerVolume) {
        this.numberOfSheets = numberOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public boolean hasEnoughPaper(int pagesToPrint, int numberOfCopies) {
        return (pagesToPrint * numberOfCopies) < getNumberOfSheets();
    }

    public boolean hasEnoughToner(int pagesToPrint, int numberOfCopies) {
        return (pagesToPrint * numberOfCopies) < getTonerVolume();
    }

    public void print(int pagesToPrint, int numberOfCopies) {
        if (hasEnoughPaper(pagesToPrint, numberOfCopies) && hasEnoughToner(pagesToPrint, numberOfCopies)) {
            int sheetsToPrint = pagesToPrint * numberOfCopies;
            numberOfSheets -= sheetsToPrint;
            tonerVolume -= sheetsToPrint;
        }
    }
}
