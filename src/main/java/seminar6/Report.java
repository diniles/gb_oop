package seminar6;

public class Report {
    private byte[] data;

    public Report(Document doc) {
        this.data = doc.getData().getBytes();
    }

    public byte[] getReportData() {
        return this.data;
    }
}
