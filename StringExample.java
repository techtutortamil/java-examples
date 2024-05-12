public class StringExample {

    public static void main(String[] args) {
        String s1 = "Tech Tutor Tamil";
        System.out.println("Loc:S1:"+System.identityHashCode(s1));
        String s2 = "Tech Tutor Tamil";
        System.out.println("Loc:S2:"+System.identityHashCode(s2));

        String s3 = new String("Tech Tutor Tamil");
        System.out.println("Loc:S3:"+System.identityHashCode(s3));

        String s4 = new String("Tech Tutor Tamil");
        System.out.println("Loc:S4:"+System.identityHashCode(s4));

        System.out.println("S1==S2:"+(s1==s2));
        System.out.println("S3==S4:"+(s3==s4));

        System.out.println("S1 equals S2:"+(s1.equals(s2)));
        System.out.println("S3 equals S4:"+(s3.equals(s4)));

        String s5 = new String("TECH TUTOR TAMIL");
        System.out.println("S5 equals S4:"+(s4.equalsIgnoreCase(s5)));
    }
    
}
