// Source code is decompiled from a .class file using FernFlower decompiler.
class Overload {
   int roll_no;
   String name;
   int marks;

   public Overload() {
      this.roll_no = 18;
      this.name = "Najeem Pathan";
      this.marks = 85;
      System.out.println("Roll no: " + this.roll_no + ", Name: " + this.name + ", Marks: " + this.marks);
   }

   public Overload(int var1) {
      this.roll_no = var1;
      System.out.println("Roll no: " + this.roll_no);
   }

   public Overload(int var1, String var2) {
      this.roll_no = var1;
      this.name = var2;
      System.out.println("Roll no: " + this.roll_no + ", Name: " + var2);
   }

   public Overload(int var1, String var2, int var3) {
      this.roll_no = var1;
      this.name = var2;
      this.marks = var3;
      System.out.println("Roll no: " + this.roll_no + ", Name: " + var2 + ", Marks: " + var3);
   }

   public static void main(String[] var0) {
      new Overload();
      new Overload(20);
      new Overload(21, "Parth");
      new Overload(4, "Krishnaraj", 51);
   }
}
