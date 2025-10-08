import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Date date;

    Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.date = new Date(); // Дата создания - текущее время
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public Date getDate(){
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "Задача: (" + "Название задачи: " + title + ", Описание: " + description + ", Дата: " + date + ")";
    }
}


