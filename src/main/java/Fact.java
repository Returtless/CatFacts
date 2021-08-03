import com.fasterxml.jackson.annotation.JsonProperty;

public class Fact {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("user")
    public String getUser() { return user; }
    @JsonProperty("user")
    public void setUser(String value) { this.user = value; }

    @JsonProperty("upvotes")
    public Integer getUpvotes() { return upvotes; }
    @JsonProperty("upvotes")
    public void setUpvotes(Integer value) { this.upvotes = value; }


    @Override
    public String toString() {
        return "Fact{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes=" + upvotes +
                '}';
    }
}
