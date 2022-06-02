package simpleFactory.imp;

import simpleFactory.ICourse;
import simpleFactory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
