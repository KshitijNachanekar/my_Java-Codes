public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        sb.insert(0, "hello ");
        System.out.println(sb);
        System.out.println(sb.substring(0,4));
        sb.append("Sama");
        System.out.println(sb);
        sb.delete(10, 14);
        System.out.println(sb);
        
    }
}
