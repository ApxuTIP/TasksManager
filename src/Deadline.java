import java.util.Date;

public class Deadline extends Task {
    private Date deadline;

    public Deadline(String title, String description, Date deadline) {
        super(title, description);
        this.deadline = deadline;
    }

    public Date getDeadline(){
        return deadline;
    }

    public void setDeadline(Date deadline){
        this.deadline = deadline;
    }

    @Override
    public String toString(){
        return super.toString() + ", Дедлайн: " + deadline;
    }
}