import java.util.Scanner;

public class Quadra {
    int numQuadra;
    String tipoQuadra;
    boolean coberta;
    boolean arquibcd;
    boolean bancoJgd;
    Scanner scan = new Scanner(System.in);

    public Quadra(int numQuadra, String tipoQuadra, boolean coberta, boolean arquibcd, boolean bancoJgd){
        this.numQuadra = numQuadra;
        this.tipoQuadra = tipoQuadra;
        this.coberta = coberta;
        this.arquibcd = arquibcd;
        this.bancoJgd = bancoJgd;
    }
    
    void defineInfo(){
        System.out.println("Insira numero da quadra: ");
        this.numQuadra = Integer.parseInt(scan.nextLine());
        System.out.println("Insira tipo da quadra ");
        this.tipoQuadra = scan.nextLine();
        System.out.println("A quadra tem cobertura? ");
        this.coberta = scan.nextBoolean();
        System.out.println("A quadra tem arquibancada? ");
        this.arquibcd = scan.nextBoolean();
        System.out.println("A quadra tem banco para jogadores? ");
        this.bancoJgd = scan.nextBoolean();
    }
    
    String mostraInfos(){
        return(" Numero da quadra " + this.numQuadra + ", Tipo da quadra " + this.tipoQuadra + 
                ehCoberta(this.coberta) + temArquibcd(this.arquibcd) + temBanco(this.bancoJgd));
    }
    
    String ehCoberta(boolean condicao){
        if(condicao == true){ return(", Eh coberta"); }
        else { return (", Nao eh coberta"); }
    }
    String temArquibcd(boolean condicao){
        if(condicao == true){ return(", Tem arquibancada"); }
        else { return(", Nao tem arquibancada"); }
    }
    String temBanco(boolean condicao){
        if(this.bancoJgd == true) { return(", Tem banco para jogadores"); }
        else { return(", Nao tem banco para jogadores"); }
    }
}
