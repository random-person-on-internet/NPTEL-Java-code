class Student<T extends Number> {
    String name;
    T[] marks;

    Student(T[] marks) {
        this.marks = marks;
    }

    double total() {
        double sum = 0.0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i].doubleValue();
        }
        return sum;
    }

    boolean compareMarks(Student<?> otherMarks) {
        if (total() == otherMarks.total()) {
            return true;
        }
        return false;
    }
}

class genericWithWildcardArgument {
    public static void main(String[] args) {

        Double arr[] = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        Integer arr2[] = { 1, 2, 3, 4, 5 };
        Student<Double> s1 = new Student<Double>(arr);
        Student<Integer> s2 = new Student<Integer>(arr2);

        System.out.println(s1.compareMarks(s2));
    }
}