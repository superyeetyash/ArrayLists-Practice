public class Student {
    private String name;
    private int id;
    private int mathScore;
    private int scienceScore;
    private int historyScore;

    public Student(String name, int id, int mathScore, int scienceScore, int historyScore) {
        this.name = name;
        this.id = id;
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.historyScore = historyScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getScienceScore() {
        return scienceScore;
    }

    public void setScienceScore(int scienceScore) {
        this.scienceScore = scienceScore;
    }

    public int getHistoryScore() {
        return historyScore;
    }

    public void setHistoryScore(int historyScore) {
        this.historyScore = historyScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mathScore=" + mathScore +
                ", scienceScore=" + scienceScore +
                ", historyScore=" + historyScore +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Student stu = (Student)(obj);
        return this.id == stu.id;
    }
    //
//    public String toString()
//    {
//        String s = "";
//        s += "Name:" + name;
//        s += "\nID: " + id;
//        s += "\nMathScore: " + mathScore;
//        s += "\nScienceScore: " + scienceScore;
//        s += "\nHistoryScore" + historyScore + "\n";
//        return s;
//    }
}
