public class Student {
    String name;
    int[] scores;

    Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    double getAverage(){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        return average;
    }

    String getGrade(){
        double average = getAverage();
        if(average <= 100 && average >= 90){
            return "A";
        }else  if(average <= 89 & average >= 80){
            return "B";
        }else if(average <= 79 && average >=70 ){
            return "C";
        }else if(average <= 69 && average >= 60){
            return "D";
        }else{
            return "F";
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Jenny", new int[] {80,60,90});
        System.out.println(s1.getAverage());
        System.out.println(s1.getGrade());
    }
}