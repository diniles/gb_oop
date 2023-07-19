package seminar6;

public class ReportXml extends Report implements Format {
    @Override
    public void print(String data) {
        System.out.printf("Report in XML \n %s\n", data);
    }
}
