public class MicroKitchenTable
{
    public static void main(String[] args)
    {
        int saraCookiesPerDay = 3;
        double saraCerealPerDay = .06;
        String saraName = "Sara";
        int cayCookiesPerDay = 1;
        double cayCerealPerDay = 0;
        String cayName = "Cay";
        String rowFormat = "%8d|%8.2f|%s\n";
        System.out.println("cookies | cereal | name");
        System.out.println("------------------------");
        System.out.printf(rowFormat, saraCookiesPerDay, saraCerealPerDay, saraName);
        System.out.printf(rowFormat, cayCookiesPerDay, cayCerealPerDay, cayName);
    }
}
