import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    //학생들의 이름이 들어있는 list를 return 하는 method
    private List<String> students = new ArrayList<>();

    public LikeLion2th(){
        Names names = new Names();
        this.students = names.names();
    }

    public List<String> getStudentList(){
        return this.students;
    }
}