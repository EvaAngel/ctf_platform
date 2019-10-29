package bean;

/**
 *
 * 团队类
 * **/
public class Team {
    private String id;
    private String teamname;
    private String teampass;
    private Integer teamgrade;
    private String status;

    public void setId(String id) {
        this.id = id;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public void setTeampass(String teampass) {
        this.teampass = teampass;
    }

    public void setTeamgrade(Integer teamgrade) {
        this.teamgrade = teamgrade;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getTeamname() {
        return teamname;
    }

    public String getTeampass() {
        return teampass;
    }

    public Integer getTeamgrade() {
        return teamgrade;
    }

    public String getStatus() {
        return status;
    }
}
