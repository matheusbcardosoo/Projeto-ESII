public class SoftwareEngineering {

    //Programa para registro de quadra, projeto Engenharia de Software II
    public static void main(String[] args) {
        Quadra q1 = new Quadra(15, "Beachtenis", true, true, false);
        Quadra q2 = new Quadra(22, "Tenis rapido", false, false, false);
        Quadra q3 = new Quadra(0, "", false, false, false);
        System.out.println(q1.mostraInfos());
        System.out.println(q2.mostraInfos());
        
        q3.defineInfo();
        System.out.println(q3.mostraInfos());
    }
}
