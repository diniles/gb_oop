package seminar6;

public class Homework {
    public static void main(String[] args) {
        Document document = new Document("100500");

        ReportEntrypoint reportEntrypoint = new ReportEntrypoint();
        Report reportPdf = reportEntrypoint.create(document, "pdf");
        Report reportJson = reportEntrypoint.create(document, "json");
        Report reportXml = reportEntrypoint.create(document, "xml");
//        Report reportError = reportEntrypoint.create(document, "Error");

        reportPdf.printData();
        reportJson.printData();
        reportXml.printData();
//        reportError.printData();
    }
}
