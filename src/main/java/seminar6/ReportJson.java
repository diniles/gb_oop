package seminar6;

public class ReportJson extends Report implements Format {
    @Override
    public void print(String data) {
        System.out.printf("Report in JSON \n %s\n", data);
    }
}
