package seminar6;

public class ReportGeneratorPdf implements ReportGenerator {
    @Override
    public Report generateReport(Document document) {
        String header = "PDF report\n";
        String reportData = header + document.getData();
        return new Report(reportData);
    }
}
