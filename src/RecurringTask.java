import java.util.Date;

public class RecurringTask extends Task{
    private String interval;
    private Date startdate;

    RecurringTask(String title, String description, String interval, Date startdate) {
        super(title, description);
        this.interval = interval;
        this.startdate = startdate;
    }

    public String getInterval(){
        return interval;
    }

    public void setInterval(String interval){
        this.interval = interval;
    }

    public Date getStartDate(){
        return startdate;
    }

    public void setStartDate(Date startdate){
        this.startdate = startdate;
    }

    @Override
public String toString(){
        return super.toString() + ", Интервал: " + interval + ", Начальная дата: " + startdate + ")";
    }
}
