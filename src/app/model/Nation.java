package app.model;

public class Nation {
    private int id;
    private String nationCode, nationName;

    public Nation() {
    }

    public Nation(int id, String nationCode, String nationName) {
        this.id = id;
        this.nationCode = nationCode;
        this.nationName = nationName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "id=" + id +
                ", nationCode='" + nationCode + '\'' +
                ", nationName='" + nationName + '\'' +
                '}';
    }
}
