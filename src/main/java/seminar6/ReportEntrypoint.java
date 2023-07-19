package seminar6;

import java.util.HashMap;
import java.util.Map;

public class ReportEntrypoint {
    private final Map<String, ReportGenerator> reportGenerators;

    public ReportEntrypoint() {
        reportGenerators = new HashMap<>();
        reportGenerators.put("pdf", new ReportGeneratorPdf());
        reportGenerators.put("json", new ReportGeneratorJson());
    }

    public Report create(Document document, String reportType) {
        ReportGenerator reportGenerator = reportGenerators.get(reportType.toLowerCase());
        if (reportGenerator == null) {
            throw new IllegalArgumentException("Wrong report type!");
        }
        return reportGenerator.generateReport(document);
    }
}
