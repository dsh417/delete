package simpleFactory;

public class PythonCourse implements ICourse{

    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
