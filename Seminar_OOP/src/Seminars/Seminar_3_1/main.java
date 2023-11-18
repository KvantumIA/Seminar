package Seminars.Seminar_3_1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        Student student1 = new Student("1", "1", "1",1);
        Student student2 = new Student("2", "2", "2",2);
        Student student3 = new Student("3", "3", "3",3);
        Student student4 = new Student("4", "4", "4",4);
        Teacher teacher = new Teacher("t", "t", "t", 13);
        List<Student> list1 = new ArrayList<>();
        list1.add(student3);
        list1.add(student4);
        list1.add(student1);
        list1.add(student2);
        StudentGroup studentGroup1 = new StudentGroup(teacher, list1);
        System.out.println(studentGroup1);


        Student student5 = new Student("5", "5", "5",5);
        Student student6 = new Student("6", "6", "6",6);
        Student student7 = new Student("7", "7", "7",7);
        Student student8 = new Student("8", "8", "8",8);
        Teacher teacher2 = new Teacher("t2", "t2", "t2", 14);
        List<Student> list2 = new ArrayList<>();
        list2.add(student5);
        list2.add(student6);
        list2.add(student7);
        list2.add(student8);
        StudentGroup studentGroup2 = new StudentGroup(teacher2, list2);


        Student student9 = new Student("9", "9", "9",9);
        Student student10 = new Student("10", "10", "10",10);
        Student student11 = new Student("11", "11", "11",11);
        Student student12 = new Student("12", "12", "12",12);
        Teacher teacher3 = new Teacher("t3", "t3", "t3", 15);
        List<Student> list3 = new ArrayList<>();
        list3.add(student9);
        list3.add(student10);
        list3.add(student11);
        list3.add(student12);
        StudentGroup studentGroup3 = new StudentGroup(teacher3, list3);

        Student student13 = new Student("13", "13", "13",13);
        Student student14 = new Student("14", "14", "14",14);
        Student student15 = new Student("15", "15", "15",15);
        List<Student> list4 = new ArrayList<>();
        list4.add(student9);
        list4.add(student10);
        list4.add(student11);
        list4.add(student12);
        StudentGroup studentGroup4 = new StudentGroup(teacher3, list3);

        Stream stream1 = new Stream(List.of(studentGroup1, studentGroup2));
        Stream stream2 = new Stream(List.of(studentGroup3));

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.sort(new StreamComparator());
//        System.out.println(streams);

    }


//    public static void testIterator(StudentGroup studentGroup){
//        StudentGroupIterator groupIterator = new StudentGroupIterator(studentGroup);
//        while (groupIterator.hasNext()){
//            System.out.println(groupIterator.next());
//        }
//
//    }

}
