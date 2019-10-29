package bean;


/**
 * 试题类
 * **/
public class Test {
    private String id;
    private Integer testscore;
    private String testname;
    private String testcontent;
    private String testmark;
    private String testflag;
    private TestType testType;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTestscore() {
        return testscore;
    }

    public void setTestscore(Integer testscore) {
        this.testscore = testscore;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    public String getTestcontent() {
        return testcontent;
    }

    public void setTestcontent(String testcontent) {
        this.testcontent = testcontent;
    }

    public String getTestmark() {
        return testmark;
    }

    public void setTestmark(String testmark) {
        this.testmark = testmark;
    }

    public String getTestflag() {
        return testflag;
    }

    public void setTestflag(String testflag) {
        this.testflag = testflag;
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
