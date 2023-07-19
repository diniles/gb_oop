package seminar6;

public class Homework {
    public static void main(String[] args) {
        Document document = new Document("100500");

        Formats formats = new Formats();
        formats.addFormat("PDF", new ReportPdf());
        formats.addFormat("JSON", new ReportJson());
        formats.addFormat("XML", new ReportXml());

        ReportEntrypoint reports = new ReportEntrypoint();
        reports.create(document, "PDF");
    }
}
