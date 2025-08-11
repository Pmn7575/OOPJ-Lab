class Overload1 {
    int roll_no;
    String name;
    int marks;

    // Default constructor
    public Overload() {
        this.roll_no = 18;
        this.name = "Najeem Pathan";
        this.marks = 85;
        System.out.println("Roll no: " + roll_no + ", Name: " + name + ", Marks: " + marks);
    }

    // Constructor with 1 parameter
    public Overload(int roll) {
        this.roll_no = roll;
        System.out.println("Roll no: " + roll_no);
    }

    // Constructor with 2 parameters
    public Overload(int roll, String name) {
        this.roll_no = roll;
        this.name = name;
        System.out.println("Roll no: " + roll_no + ", Name: " + name);
    }

    // Constructor with 3 parameters
    public Overload(int roll, String name, int marks) {
        this.roll_no = roll;
        this.name = name;
        this.marks = marks;
        System.out.println("Roll no: " + roll_no + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Overload O1 = new Overload();                        // Default
        Overload O2 = new Overload(20);                      
        Overload O3 = new Overload(21, "Ramit");             
        Overload O4 = new Overload(4, "Krishna", 89);        
    }
}
