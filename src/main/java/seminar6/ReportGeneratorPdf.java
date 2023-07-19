package seminar6;

public class ReportGeneratorPdf implements ReportGenerator {
    @Override
    public Report generateReport(Document document) {
        byte[] reportData = document.getData().getBytes();
        return new Report(reportData);
    }
}
