public class ColorPrinter extends Printer{
    @Override
    public void printing() {
        System.out.println("color printing ~");
    }

    public void usingPaper(String paper, int price) {
        System.out.println("color printing ~ with paper" + paper + " price " + price);
    }

    public void usingPaper(String paper) {
        System.out.println("color printing ~ with paper" + paper);
    }

    public void usingPaper() {
        System.out.println("color printing ~ with paper with default free paper");
    }

}
