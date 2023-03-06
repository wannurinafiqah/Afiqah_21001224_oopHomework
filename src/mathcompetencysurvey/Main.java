package mathcompetencysurvey;
public class Main {
    // Application code
    public static void main(String args[]) {
        School sk1 = new School();

        // Direct access to attributes is not a good practices
        sk1.setName("SK Satu");

        Address addr = new Address();
        addr.setStreet("Jalan 9");
        addr.setDistrict("Gombak");
        addr.setPostcode("68000");
        addr.setState("Selangor");
        sk1.setAddress(addr);


        System.out.println("The name of the school is "+sk1.getName());

        Marks marks = new Marks(100);

        try {
            marks.setMark(50, 0);
            marks.setMark(52, 1);
            marks.setMark(93, 2);
            marks.setMark(40, 3);
            marks.setMark(-50, 3);

        }
        catch (Exception ex) {
            System.out.print("Marks must be positive");
            ex.printStackTrace();
        }

        float mark = marks.getMark(1);
        System.out.println("Marks for student 0 is " + mark);
    }
}

