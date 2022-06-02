package simpleFactory.imp;

import simpleFactory.ICourse;
import simpleFactory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
