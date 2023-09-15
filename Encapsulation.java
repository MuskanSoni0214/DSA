public class Encapsulation {
    String name;
    private float CGPA;
    public void setCGPA(float CGPA)
    {
        this.CGPA=CGPA;
    }
    public float getCGPA()
    {
        return CGPA;
    }
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.name="Muskan Soni";
        e.setCGPA(8.9f);
        System.out.println(e.name+"'s CGPA is "+e.getCGPA());

    }
}
