package modelDAO;

public class DataBase {
    private String dono[] = new String[7];
	private String conta[] = new String[7];
	private double valor[] = new double[7];

	public DataBase() {
		
		dono[0] = "FELIPE CARDOSO SERIKYAKU";
		dono[1] = "JOÃO GUILHERME CARVALHO NOVAES";
		dono[2] = "JULIO RODRIGUES SOARES";
		dono[3] = "MATHEUS AUGUSTO PRETO SANTANA";
		dono[4] = "MATHEUS CORCIONE SAITO";
		dono[5] = "PEDRO HENRIQUE BARBOSA BOLGHERONI";
		dono[6] = "VICTOR DE ABREU CAVALCANTE NAKANISHI";
		
		conta[0] = "92811-0";
		conta[1] = "94580-9";
		conta[2] = "46792-4";
		conta[3] = "10209-7";
		conta[4] = "11443-8";
		conta[5] = "11496-0";
		conta[6] = "43570-2";
		
		valor[0] = 7277.00;
		valor[1] = 6975.00;
		valor[2] = 963.00;
		valor[3] = 5486.00;
		valor[4] = 5278.00;
		valor[5] = 3711.00;
		valor[6] = 8672.00;
	}
	
	public String getDono(int i) {
		return this.dono[i];
	}
	
	public String getConta(int i) {
		return this.conta[i];
	}
	
	public double getValor(int i) {
		return this.valor[i];
	}
}
