package bean;


/**
 * 用户类
 * **/
public class Person {
    private String id;
    private String username;
    private String password;
    private Integer grade;
    private Team team;
    private String status;

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getGrade() {
        return grade;
    }

    public Team getTeam() {
        return team;
    }

    public String getStatus() {
        return status;
    }
}
