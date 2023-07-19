package seminar6;

public class Report {
    private byte[] data;

    Document document;
    String format;

    public Report(Document document, String format) {
        this.document = document;
        this.format = format;
    }

    public byte[] getReportData() {
        return this.data;
    }
}
