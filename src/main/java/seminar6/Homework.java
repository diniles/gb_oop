package seminar6;

public class Homework {
    public static void main(String[] args) {
        Document document = new Document("100500");

        ReportEntrypoint reportEntrypoint = new ReportEntrypoint();
        Report report = reportEntrypoint.create(document, "pdf");

    }
}
