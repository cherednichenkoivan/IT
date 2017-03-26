package ijavaadv;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.Formattable;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.FormattableFlags;

@SuppressWarnings("unused")
class Person implements Cloneable,Formattable {
    private String name;
    private String surName;
    private boolean gender;
    private int age;
    private Calendar birthDay;
    private String phoneNumber;
    private Temper temper;
    enum Temper{SANGUINE, PHLEGMATIC, SUPINE, CHOLERIC, MELANCHOLIC}
    enum Distance {SHORT,MEDIUM,LONG}
    public Person(String name, String surName, boolean gender, Calendar birthDay, String phoneNumber, Temper temper ){
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.age = (new GregorianCalendar()).get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
        this.phoneNumber = phoneNumber;
        this.temper = temper;
    }
    //копирующий конструктор
    public Person(Person another) {
        this(another.getName(), another.getSurName(), another.isMan(), another.getBirthDay(),
                another.getPhoneNumber(),another.getTemper());
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    String getSurName(){
        return surName;
    }
    boolean isMan(){
        return gender;
    }
    int getAge(){
        return age;
    }
    Calendar getBirthDay(){
        return birthDay;
    }
    String getPhoneNumber(){
        return phoneNumber;
    }
    Temper getTemper(){
        return temper;
    }
    String printPerson(){
        String pol;
        if(gender){
            pol = "male";
        }
        else {
            pol = "female";
        }
        return String.format("Gender: %6s , temper: %11s ; age: %2d ; name: %11s ; surname: %13s",
                pol, temper, age, name, surName);
    }
    
    void MyPrintPerson(){
        String pol;
        if(gender){
            pol = "male";
        }
        else {
            pol = "female";
        }
      System.out.printf(new Locale("ru","ru")," name: %11s ; %n surname: %13s; %n age: %2d ;"
     		+ "%n Gender: %6s;%n temper: %11s;%n Person birthDay:  %6$td %6$tB %6$tY",
                name,surName,age, pol, temper,birthDay);
    
        
      
    }
    @Override
    public String toString(){
        String pol;
        if(gender){
            pol = "male";
        }
        else {
            pol = "female";
        }
        String bd = "; birthDay: " + birthDay.get(Calendar.DAY_OF_MONTH) + "-" + (birthDay.get(Calendar.MONTH) +
                1) + "-" + birthDay.get(Calendar.YEAR);
        return getClass().getName() + "; name: " + name + "; surname: " + surName + "; gender: " + pol + "; age: " +
                age + bd + "; tel.: " + phoneNumber + ", temper: " + temper;
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Object " + toString() + " removed!");
        } finally {
            super.finalize();
        }
    }
    @Override
    public int hashCode(){
        //return Objects.hash(name, gender, age, birthDay, phoneNumber);  // - другой вариант
        return (7 * Objects.hashCode(name)) + (11 * Objects.hashCode(gender)) + (13 * Objects.hashCode(age)) +
                + (17 * Objects.hashCode(birthDay)) + (19 * Objects.hashCode(phoneNumber));
    }
    @Override
    public boolean equals(Object another){
        if (this == another) return true;
        if (another == null) return false;
        if (this.getClass() != another.getClass()) return false;
        Person p = (Person) another;
        return (name.equals(p.name) && (gender == p.gender) && (age == p.age) &&
        birthDay.equals(p.birthDay) && phoneNumber.equals(p.phoneNumber));
    }
    @Override
    public Person clone(){
        Person copy;
        try{
            copy = (Person)super.clone();
            copy.birthDay = (Calendar)copy.birthDay.clone();
        } catch (CloneNotSupportedException ex){
            throw new AssertionError("Does class implement Cloneable?");
        }
        return copy;
    }
    
	@Override
	public void formatTo(Formatter formatter, int flags, int width, int precision) {
		formatter.format(new Locale("ru","ru")," name: %-11S ; %n surname: %-13s; %n age: %2d ;"
     		+ "%n Gender: %6s;%n temper: %11s;%n Person birthDay:  %6$td %6$tB %6$tY",
                name,surName,age, "male", temper,birthDay);
		
	}
}
