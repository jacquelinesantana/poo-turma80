package poo.modelo2;

public class Carro {
	/*
	 * classe deve levar as caracteriticas relevantes de um carro
	 * 
	 * cor - variavel => atributos*
	 * modelo*
	 * placa
	 * ano
	 * fabricante
	 * velocidadeMaxima
	 * potenciaMotor
	 * tipoCombustivel
	 * quilometragem
	 * chassi
	 */
	
	private String cor;
	private String modelo;
	private String placa;
	private int ano;
	private String fabricante;
	private int velocidadeMaxima;
	private float potenciaMotor;
	//1= gasolina| 2=alcool | 3=flex | 4=eletrico
	private int tipoCombustivel;
	private float quilometragem;
	private String chassi; //-.
	
	//metodo consegue retornar a cor
	public String getCor() {
		return cor;
	}
	
	//metodo void inserindo uma cor para o atributo cor
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public float getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(float potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	public int getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(int tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public float getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(float quilometragem) {
		this.quilometragem = quilometragem;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	//metodo construtor
	public Carro(String cor, 
			String modelo, 
			String placa, 
			int ano, 
			String fabricante, 
			int velocidadeMaxima,
			float potenciaMotor, 
			int tipoCombustivel, 
			float quilometragem, 
			String chassi) {
		
		this.cor = cor;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.fabricante = fabricante;
		this.velocidadeMaxima = velocidadeMaxima;
		this.potenciaMotor = potenciaMotor;
		this.tipoCombustivel = tipoCombustivel;
		this.quilometragem = quilometragem;
		this.chassi = chassi;
	}
	
	//cor = "branco";
	
	//Encapsulamento
	/*
	 * trabalhar com dados não publicos
	 * acesso indireto aos atributos
	 * camada segurança
	 */
	//Get e Set -> metodos
	
	
}
