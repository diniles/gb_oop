package seminar6;

public class ReportGeneratorPdf implements ReportGenerator {
    @Override
    public Report generateReport(Document document) {
        String reportData = document.getData();
        return new Report(reportData);
    }
}
