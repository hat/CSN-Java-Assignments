package sample;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Person2 {
    private String firstName;
    private String lastName;
    private String middleName;
    private String courtesyTitle;
    private String suffix;
    private int age;
    private String gender;

    public Person2() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.age = 20;
        this.gender = "male";
    }

    public Person2(String var1, String var2, int var3, String var4) {
        this.firstName = var1;
        this.lastName = var2;
        if(var3 >= 0 && var3 <= 150) {
            this.age = var3;
            if(!var4.equals("male") && !var4.equals("female")) {
                throw new IllegalArgumentException("Person objects must have a gender value of \"male\" or \"female\" only");
            } else {
                this.gender = var4;
            }
        } else {
            throw new IllegalArgumentException("Person objects must have an age value between 0 and 150 only");
        }
    }

    public Person2(String var1, String var2, String var3, String var4, String var5, int var6, String var7) {
        this.firstName = var1;
        this.lastName = var2;
        this.middleName = var3;
        if(!var4.equals("Mr.") && !var4.equals("Mrs.") && !var4.equals("Miss") && !var4.equals("Dr.") && !var4.equals("Ms.")) {
            throw new IllegalArgumentException("Person objects must have a Courtesy Title value of \"Mr.\", \"Mrs.\", \"Miss\", \"Ms.\", or \"Dr.\" only");
        } else {
            this.courtesyTitle = var4;
            this.suffix = var5;
            if(var6 >= 0 && var6 <= 150) {
                this.age = var6;
                if(!var7.equals("male") && !var7.equals("female")) {
                    throw new IllegalArgumentException("Person objects must have a gender value of \"male\" or \"female\" only");
                } else {
                    this.gender = var7;
                }
            } else {
                throw new IllegalArgumentException("Person objects must have an age value between 0 and 150 only");
            }
        }
    }

    public void setFirstName(String var1) {
        this.firstName = var1;
    }

    public void setLastName(String var1) {
        this.lastName = var1;
    }

    public void setMiddleName(String var1) {
        this.middleName = var1;
    }

    public void setCourtesyTitle(String var1) {
        if(!var1.equals("Mr.") && !var1.equals("Mrs.") && !var1.equals("Miss") && !var1.equals("Dr.") && !var1.equals("Ms.")) {
            throw new IllegalArgumentException("Person objects must have a Courtesy Title value of \"Mr.\", \"Mrs.\", \"Miss\", \"Ms.\", or \"Dr.\" only");
        } else {
            this.courtesyTitle = var1;
        }
    }

    public void setSuffix(String var1) {
        this.suffix = var1;
    }

    public void setAge(int var1) {
        if(var1 >= 0 && var1 <= 150) {
            this.age = var1;
        } else {
            throw new IllegalArgumentException("Person objects must have an age value between 0 and 150 only");
        }
    }

    public void setGender(String var1) {
        if(!var1.equals("male") && !var1.equals("female")) {
            throw new IllegalArgumentException("Person objects must have a gender value of \"male\" or \"female\" only");
        } else {
            this.gender = var1;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getCourtesyTitle() {
        return this.courtesyTitle;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }
}

