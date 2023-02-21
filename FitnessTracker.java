package FitnessTracker;

import java.util.Calendar;

public class FitnessTracker {
    private String name;
    private String email;
    private String phone;
    private int age;
    private int weight;
    private int systolicPressure;
    private int diastolicPressure;
    private int stepsTaken;

    public FitnessTracker(String name, int birthDay, int birthMonth, int birthYear, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;

        // Визначення віку
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        this.age = currentYear - birthYear;

        // Перевірка народження в цьому році
        Calendar birthdate = Calendar.getInstance();
        birthdate.set(birthYear, birthMonth - 1, birthDay);
        Calendar nextBirthday = Calendar.getInstance();
        nextBirthday.set(currentYear, birthMonth - 1, birthDay);
        if (nextBirthday.before(now) || nextBirthday.equals(now)) {
            nextBirthday.add(Calendar.YEAR, 1);
        }
        if (now.get(Calendar.YEAR) == birthYear) {
            this.age = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(int systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public int getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(int diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public int getStepsTaken() {
        return stepsTaken;
    }

    public void setStepsTaken(int stepsTaken) {
        this.stepsTaken = stepsTaken;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Systolic pressure: " + systolicPressure + " mmHg");
        System.out.println("Diastolic pressure: " + diastolicPressure + " mmHg");
        System.out.println("Steps taken today: " + stepsTaken);
    }

    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("John", 12, 3, 1990, "john@gmail.com", "123456");
    }
}