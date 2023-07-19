package seminar6;

public class ReportPdf extends Report implements Format {


    @Override
    public void print(String data) {
        System.out.printf("Report in PDF \n %s\n", data);
    }
}
