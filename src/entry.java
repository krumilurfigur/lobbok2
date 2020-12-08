import java.util.Date;

public class entry {
    private author author;
    private String body;
    private Date date;

    public entry(author author, String body) {
        this.author = author;
        this.body = body;
        this.date = java.util.Calendar.getInstance().getTime();
    }

    public author getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "author=" + author.getFirstName() + " " + author.getLastName()+
                ", body='" + body + '\'' +
                ", date=" + date +
                '}';
    }


}
