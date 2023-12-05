package christmas.domain;

public class VisitDate {
    private final int date;

    public VisitDate(String date) {
        this.date = Integer.parseInt(date);
    }
    public int getDate(){
        return this.date;
    }
}
