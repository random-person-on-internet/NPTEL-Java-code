class Student <T extends Number>{
    String name;
    T[] marks;

    Student(T[] marks){
        this.marks = marks;
    }

    double total(){
        double sum = 0.0;
        for(int i=0; i<marks.length; i++){
            sum+= marks[i].doubleValue();
        }
        return sum;
    }

    boolean compareMarks(Student<?> otherMarks){
        if(total() == otherMarks.total()){
            return true;
        }
    }
}