class Student{
    String Name;
    int Rollno;
    float marks;
}

class Array_of_objects{
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.Name = "kapil";
        s1.Rollno = 22;
        s1.marks = 55.5f;
        
        Student s2 = new Student();
        s2.Name = "Vineet";
        s2.Rollno = 26;
        s2.marks = 75.5f;
        
        Student s3 = new Student();
        s3.Name = "Alok";
        s3.Rollno = 22;
        s3.marks = 65.5f;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        
        for(int i=0;i<student.length;i++){
        System.out.println(student[i].Name + " " + student[i].Rollno+" " +student[i].marks);
        }
        //enhanced for loop
        for(Student stud : student){
        System.out.println(stud.Name + " " + stud.Rollno+" " +stud.marks);
        }

    }
}