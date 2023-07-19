package seminar6;

public class ReportGeneratorXml implements ReportGenerator {
    @Override
    public Report generateReport(Document document) {
        String header = "XML report\n";
        String reportData = header + document.getData();
        return new Report(reportData);
    }
}
