package seminar6;

public class ReportJson extends Report implements Format {
    public ReportJson(Document doc) {
        super(doc);
    }

    @Override
    public void print(String data) {
        System.out.printf("Report in JSON \n %s\n", data);
    }
}
